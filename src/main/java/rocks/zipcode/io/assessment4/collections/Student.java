package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs = new ArrayList<>();

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs.addAll(labs);
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
