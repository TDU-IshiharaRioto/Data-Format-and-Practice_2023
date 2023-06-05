public class F3_1 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ00", "ŽR“c", 70);
        System.out.print ("id:" + enrollee.getId() + ",");
        System.out.print ("name:" + enrollee.getName() +",");
        System.out.println ("score:" + enrollee.getScore());
    }
}
