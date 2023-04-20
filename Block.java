public class Block implements Stackable {
    private String name;
    private int height;

    public Block (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName () {
        return this.name;
    }

    public int getHeight () {
        return this.height;
    }
}
