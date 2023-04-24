import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F2_6 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add ("a");
        list1.add ("b");
        list1.add ("c");

        print (list1);

        List<String> list2 = Arrays.asList("a", "b", "c", "d", "e");

        print (list2);
    }

    public static void print (List<String> list) {
        for (String s: list) {
            System.out.print (s);
        }
        System.out.println();
    }
}
