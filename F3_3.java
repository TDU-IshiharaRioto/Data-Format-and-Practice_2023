import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class F3_3 {
    public static void main(String[] args) {
        String pathName = "data2.csv";
        Path path = Paths.get(pathName);
        List<String> list = CsvUtils.readAllLines(path);
        for (String line: list) {
            System.out.println (line);
        }
    }
}
