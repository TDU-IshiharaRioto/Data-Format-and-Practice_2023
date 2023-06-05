import java.lang.reflect.Field;

public class F4_2 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Enrollee enrollee = new Enrollee("00AJ000", "山田", 70);
        Instructor instructor = new Instructor("00SD00", "中山");
        print (enrollee);
        print (instructor);
=======
    Enrollee enrollee = new Enrollee ("00AJ000", "山田", 70);
    Instructor instructor = new Instructor("00SD00", "中山");
    print (enrollee);
    print (instructor);
>>>>>>> 37d3c8bae54350ed2afc512d5852513d9778edb5
    }

    public static void print (Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            System.out.println (field.getName());
        }
    }
}
