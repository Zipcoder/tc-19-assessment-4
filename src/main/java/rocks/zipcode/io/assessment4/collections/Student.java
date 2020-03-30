package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName() == labName){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab lab : labs) {
            if (lab.getName() == labName) {
                lab.setStatus(labStatus);
            }
        } if (getLab(labName) == null) {
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String string = "";

        for (int i = labs.size() - 1; i > -1; i--) {
            if (i == 0) {
                string += labs.get(i).getName() + " > " + labs.get(i).getStatus();
            } else
                string += labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n";
        }
        return string;
    }

}
