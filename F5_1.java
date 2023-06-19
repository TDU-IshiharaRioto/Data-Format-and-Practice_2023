public class F5_1 {
    public static void main(String[] args) {
        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ00", "è¨‡_", 80));
        locator.add(new Enrollee("00AJ99", "çÇñÏ", 90));

        for (int i = 0; i < locator.size(); i++) {
            Enrollee enrollee = locator.get(i);
            System.out.println(enrollee.getId() + " " + enrollee.getName() + " " + enrollee.getScore());
        }

        /*
        for (Enrollee enrollee: locator) {
            System.out.println(enrollee.getId() + " " + enrollee.getName() + " " + enrollee.getScore());
        }
        */

    }
}
