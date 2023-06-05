import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class F3_8 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ00", "ŽR“c", 70);
        Class<?> clazz = enrollee.getClass();
        try {
            PropertyDescriptor pd = new PropertyDescriptor("id", clazz);
            Method method = pd.getReadMethod ();
            Object object = method.invoke(enrollee);
            System.out.print (object.toString());
        } catch (IntrospectionException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
