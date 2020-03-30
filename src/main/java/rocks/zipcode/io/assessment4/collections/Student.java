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
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }


    public void setLabStatus(String labName, LabStatus labStatus) {
        if (labs.contains(getLab(labName))) {
            getLab(labName).setStatus(labStatus);
        } else throw new UnsupportedOperationException();
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String list = "";

        for (int i = labs.size() - 1; i >= 0; i--) {
            list += labs.get(i).getName() + " > " + labs.get(i).getStatus() + "\n";
        }
        list = list.substring(0, list.length() - 1);
        return list;
    }
}