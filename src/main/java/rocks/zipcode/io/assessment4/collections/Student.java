package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
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
        if (labs.size()==0){
            labs.add(new Lab(labName));
        }
        for (Lab lab : labs){
            if (lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        if (getLab(labName).getForked()) {
            getLab(labName).setStatus(labStatus);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        lab.setForked(true);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
            return getLab(labName).getStatus();
    }
}
