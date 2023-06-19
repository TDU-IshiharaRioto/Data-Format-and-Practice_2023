import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.json.bind.annotation.JsonbProperty;

public class EnrolleeLocator implements Iterable<Enrollee>{

    @JsonbProperty(value = "enrollees")
    private List<Enrollee> enrollees = new ArrayList<Enrollee>();

    public EnrolleeLocator () {

    }

    public List<Enrollee> getEnrollees () {
        return this.enrollees;
    }

    public void setEnrollees (List<Enrollee> enrollees) {
        this.enrollees = enrollees;
    }

    public void add (Enrollee enrollee) {
        this.enrollees.add(enrollee);
    }

    public Enrollee get (int number) {
        return this.enrollees.get(number);
    }

    public int size () {
        return this.enrollees.size();
    }

    @Override
    public Iterator<Enrollee> iterator () {
        return this.enrollees.iterator();
    } 
}
