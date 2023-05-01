import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class F2_8 {
    public static void main(String[] args) {
        String pathName = "data1.txt";
        Charset charset = Charset.forName("Windows-31J");
        String data = readAll (Paths.get(pathName), charset);
        System.out.println (data); 
    }

    public static String readAll (Path path, Charset charset) {
        try {
            return new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
