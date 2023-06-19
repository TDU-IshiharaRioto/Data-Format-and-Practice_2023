import javax.json.bind.JsonbBuilder;
import javax.json.bind.Jsonb;

public class F6_1 {
    public static void main(String[] args) {
        Jsonb jsonb = JsonbBuilder.create();

        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ03", "���c", 60));
        locator.add(new Enrollee("00AJ04", "�R�c", 80));

        System.out.println (jsonb.toJson(locator));
    }
}
