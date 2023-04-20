import java.util.ArrayList;
import java.util.List;

public class StackList {
    private List<Stackable> list = new ArrayList<Stackable> ();
    public StackList () {
    }

    public void add (Stackable stackable) {
        this.list.add(stackable);
    }

    public Stackable remove () {
        int size = this.list.size();
        return this.list.remove(size - 1);
    }

    public int size () {
        return this.list.size();
    }

    public void print () {
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            Stackable stackable = this.list.get (size - 1 - i);
            System.out.println (stackable.getName() + " " + stackable.getHeight());
        }
    }

    public int getHeight () {
        int sum = 0;
        int size = this.list.size ();
        for (int i = 0; i < size; i++) {
            Stackable stackable = this.list.get (i);
            sum = sum + stackable.getHeight();
        }
        return sum;
    }
}
