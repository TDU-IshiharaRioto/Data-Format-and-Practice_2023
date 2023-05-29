import java.util.Arrays;
import java.util.List;

public class F4_3 {
    public static void main(String[] args) {
        List<Enrollee> list = Arrays.asList(
            new Enrollee("00AJ000", "è¨‡_", 80),
            new Enrollee("00AJ99", "çÇñÏ", 90)
        );
        System.out.println (toHeader(list.get(0)));
        for (Enrollee e: list) {
            System.out.println (toCsv(e));
        }
    }

    public static String toHeader (Enrollee enrollee) {
        return "id,name,score";
    }

    public static String toCsv (Enrollee enrollee) {
        return enrollee.getId() + "," + enrollee.getName() + "," + enrollee.getScore();
    }
}
