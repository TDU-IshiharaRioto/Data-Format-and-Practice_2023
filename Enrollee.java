public class Enrollee {
    private String id;
    private String name;
    private int score;

    public Enrollee (String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId () {
        return this.id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getScore () {
        return this.score;
    }

    public void setScore (int score) {
        this.score = score;
    }

}
