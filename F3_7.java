import java.lang.reflect.Field;

public class F3_7 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee();
        Class<?> clazz = enrollee.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            System.out.println (field.getName());
        }
    }
}
