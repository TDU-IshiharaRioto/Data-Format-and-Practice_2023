import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F3_4 {
    public static void main(String[] args) {
        String pathName = "data2.csv";
        List<String> list = CsvUtils.readAllLines(Paths.get(pathName));
        List<Enrollee> enrolleeList = toEnrolleeList (list.subList(1, list.size()));

        for (Enrollee enrollee: enrolleeList) {
            System.out.print (enrollee.getId() + " " + enrollee.getName());
            System.out.println (" " + enrollee.getScore());
        }
    }

    public static List<Enrollee> toEnrolleeList (List<String> list) {
        List<Enrollee> enrolleeList = new ArrayList<Enrollee>();
        for (String line: list) {
            enrolleeList.add(newEnrollee(line));
        }
        return enrolleeList;
    }

    public static Enrollee newEnrollee (String line) {
        String[] fields = line.split(",", -1);
        return new Enrollee(fields[0], fields[1], Integer.parseInt(fields[2]));
    }
}