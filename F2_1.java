public class F2_1 {
    public static void main (String[] args) {
        method1();
        F2_1 F1 = new F2_1();
        F1.method2();
    }

    public static void method1 () {
        System.out.println ("クラスメソッドが呼ばれました");
    }

    public void method2 () {
        System.out.println ("インスタンスメソッドが呼ばれました。");
    }
}