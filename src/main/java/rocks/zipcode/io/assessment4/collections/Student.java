package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private ArrayList<Lab> labs;

    public Student() {

        this(new ArrayList<>());
    }

    public Student(ArrayList<Lab> labs) {
        this.labs =labs;
    }

    public Lab getLab(String labName) {

        for(Lab lab :labs){
            if(labName.equals(lab.getName())) return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        boolean contains = false;
        for(Lab lab : labs){
            if(labName.equals(lab.getName())){
                lab.setStatus(labStatus);
                contains = true;
                break;
            }
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab : labs)  {
            if(labName.equals(lab.getName())) return lab.getStatus();
        }

          return null;
    }
}

