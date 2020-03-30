package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private LabStatus labStatus;
    private Lab lab;
    private List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        Lab lab = null;
        for(int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getName().equals(labName)) {
                lab = labs.get(i);
                break;
            }
        }
        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try {
            getLab(labName).setStatus(labStatus);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

}
