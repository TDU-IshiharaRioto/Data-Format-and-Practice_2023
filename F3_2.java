import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class F3_2 {
    public static final Charset CHARSET = Charset.forName ("Windows-31J");
    public static void main(String[] args) {
        String pathName = "data2.csv";
        List<String> list = readAll (Paths.get(pathName));
        for (String line: list) {
            System.out.println (line);
        }
    }

    public static List<String> readAll (Path path) {
        return PathUtils.readAllLines(path, CHARSET);
    }
}
