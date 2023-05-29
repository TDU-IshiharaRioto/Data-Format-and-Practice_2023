public class Instructor {
    private String name;
    private String id;
    public Instructor (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public String getId () {
        return this.id;
    }

    public void setId (String id) {
        this.id = id;
    }
}