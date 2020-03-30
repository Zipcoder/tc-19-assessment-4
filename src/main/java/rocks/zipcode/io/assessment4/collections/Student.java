package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;
    LabStatus labStatus;
    Student student;

    public Student() {

        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {

        this.labs = labs;
    }

    public Lab getLab(String labName) {

        for (int i = 0; i < labs.size(); i++) {

            if (labs.get(i).getName().equals(labName)) {
                return labs.get(i);
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        try {
            Lab foundLab = getLab(labName);
            foundLab.setStatus(labStatus);}
        catch (Exception e){
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

    public String toString() {

        String result = "";
        for(int i = labs.size() -1; i >= 0; i--) {
            if (i == 0) {
                result += labs.get(i).toString();
            }
            else { result += labs.get(i).toString() + '\n';
            }
        }
        return result;
    }
}
