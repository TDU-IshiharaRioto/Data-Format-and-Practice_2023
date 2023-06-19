import java.nio.file.Path;
import java.nio.file.Paths;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.Jsonb;
import java.util.ArrayList;
import java.util.List;

public class F6_4 {
    public static void main(String[] args) {
        Path jsonPath = csv2json (Paths.get("data2.csv"), Paths.get("data5.json"));
        System.out.println (jsonPath.getFileName());
    }

    public static Path csv2json (Path csvPath, Path jsonPath) {
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);

        List<String> csv = new ArrayList<String>(CsvUtils.readAllLines(csvPath));
        csv.remove(0);
        
        EnrolleeLocator enrolleeLocator = new EnrolleeLocator();

        for (String line : csv) {
            String[] data = line.split(",");
            enrolleeLocator.add(new Enrollee(data[0], data[1], Integer.parseInt(data[2])));
        }
    
        return JsonUtils.writeString(jsonPath, jsonb.toJson(enrolleeLocator));
    }
}
