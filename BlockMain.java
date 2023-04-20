public class BlockMain {
    public static void main(String[] args) {
        StackList stackList = new StackList();
        stackList.add (new Block ("Apple", 10));
        stackList.add(new Block("Note", 20));   
        stackList.add(new Block("Book", 30));

        stackList.print ();
        System.out.println ("Total Height " + stackList.getHeight());
    }
}
