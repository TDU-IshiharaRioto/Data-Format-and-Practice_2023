import java.util.Arrays;
import java.util.List;

public class F4_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        String csv = String.join(",", list);
        System.out.println (csv);
    }
}
