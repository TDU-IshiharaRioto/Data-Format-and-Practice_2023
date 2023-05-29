import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.beans.IntrospectionException;

public class F4_6 {
    public static void main(String[] args) {
        List<Enrollee> list = Arrays.asList(
            new Enrollee ("00AJ000", "è¨‡_", 80),
            new Enrollee("00AJ99", "çÇñÏ", 90)
        );
        System.out.println (toHeader(list.get(0)));
        for (Enrollee e: list) {
            System.out.println (toCsv(e));
        }
    }

    public static final String DELIMITER = ",";

    public static String toHeader (Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        if (fields == null || fields.length == 0) {
            return "";
        }
        List<String> list = new ArrayList<String>(fields.length);
        for (Field field: fields) {
            list.add(field.getName());
        }
        return String.join(DELIMITER, list);
    }

    public static String toCsv (Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        if (fields == null || fields.length == 0) {
            return "";
        }
        List<String> list = new ArrayList<String>(fields.length);
        try {
            for (Field field: fields) {
                Class<?> clazz = object.getClass();
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
                Method method = pd.getReadMethod();
                Object ro = method.invoke(object);
                list.add(ro.toString());
            } 
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | IntrospectionException e) {
            e.printStackTrace();
        }
        return String.join(DELIMITER, list);
    }
}
