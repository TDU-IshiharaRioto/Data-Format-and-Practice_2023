import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class F4_1 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ000", "ŽR“c", 70);
        Instructor instructor = new Instructor("00SD00", "’†ŽR");
        //print1 (enrollee);
        //print2 (instructor);
        print (enrollee);
        print (instructor);
    }

    public static void print1 (Enrollee enrollee) {
        System.out.print ("id:" + enrollee.getId() + " ");
        System.out.print ("name:" + enrollee.getName() + " ");
        System.out.println ("score:" + enrollee.getScore());
    }

    public static void print2 (Instructor instructor) {
        System.out.print ("id:" + instructor.getId() + " ");
        System.out.println ("score:" + instructor.getName());
    }

    public static void print (Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            try {
                String fName = field.getName();
                PropertyDescriptor pd = new PropertyDescriptor(fName, clazz);
                Method method = pd.getReadMethod();
                Object result = method.invoke(object);
                System.out.print (fName + ":" + result.toString() + " ");
            } catch (IntrospectionException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println ();
    }
}
