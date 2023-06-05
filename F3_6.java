public class F3_6 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee();
        Class<?> clazz = enrollee.getClass();
        System.out.println (clazz == Enrollee.class);
    }
}
