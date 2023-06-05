import java.lang.reflect.Field;

public class F4_2 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ000", "ŽR“c", 70);
        Instructor instructor = new Instructor("00SD00", "’†ŽR");
        print (enrollee);
        print (instructor);
    }

    public static void print (Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            System.out.println (field.getName());
        }
    }
}
