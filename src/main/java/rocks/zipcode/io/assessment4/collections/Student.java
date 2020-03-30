package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on
 * 10/12/2018.
 */
public class Student {
    private List<Lab> labs;

    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab each : labs) {
            if (each.getName().equals(labName)){
                return each;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if ((lab == null)) {
            throw new UnsupportedOperationException();
        }
        lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(0, lab);
            }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab : labs) {
            if(lab.getName().equals(labName)){
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "labs=" + labs +
                '}';
    }
}

