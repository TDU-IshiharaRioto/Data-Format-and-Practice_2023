import javax.json.bind.Jsonb;
import javax.json.bind.JsonbConfig;
import javax.json.bind.JsonbBuilder;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F6_3 {
    public static void main(String[] args) {
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);

        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);

        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ03", "çÇìc", 60));
        locator.add(new Enrollee("00AJ04", "éRìc", 80));

        String jsonName = "data4.json";
        Path path = Paths.get(jsonName);
        JsonUtils.writeString(path, jsonb.toJson(locator));
    }
}
