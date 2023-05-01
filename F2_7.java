import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class F2_7 {
    public static void main(String[] args) {
        String pathName = "data1.txt";
        byte[] data = new byte[0];
        try {
            data = Files.readAllBytes(Paths.get(pathName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print (String.format ("%02x", data[i]));
        }
    }
}
