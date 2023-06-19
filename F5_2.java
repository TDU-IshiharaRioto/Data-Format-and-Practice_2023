import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import javax.json.bind.annotation.JsonbProperty;

public class F5_2 {
    public static void main(String[] args) {
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ00", "è¨‡_", 80));
        //locator.add(new Enrollee("00AJ99", "çÇñÏ", 90));
        print (locator);
    }

    public static void print (Object object) {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonbProperty.class)) {
                Annotation annotation = field.getAnnotation(JsonbProperty.class);
                JsonbProperty jsonbProperty = JsonbProperty.class.cast(annotation);
                System.out.println(jsonbProperty.value());
            }
        }
    }
}
