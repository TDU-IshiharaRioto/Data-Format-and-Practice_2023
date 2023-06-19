import java.nio.file.Paths;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class F5_4 {
    public static void main(String[] args) {
        String all = JsonUtils.readAll(Paths.get("data3.json"));

        Jsonb jsonb = JsonbBuilder.create();
        EnrolleeLocator locator = jsonb.fromJson(all, EnrolleeLocator.class);
        //EnrolleeLocator locator2 = new EnrolleeLocator();

        /*
        //ì‰ÉGÉâÅ[
        for (Enrollee enrollee : locator2) {
            System.out.println(enrollee.getId() + " " + enrollee.getName() + " " + enrollee.getScore());
        }
        */

        for (int i = 0; i < locator.size(); i++) {
            Enrollee enrollee = locator.get(i);
            System.out.println(enrollee.getId() + " " + enrollee.getName() + " " + enrollee.getScore());
        }
    }
}
