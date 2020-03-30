package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        if(labs != null){
            this.labs = labs;
        }
        else{
            this.labs = new ArrayList<>();
        }
    }

    public Lab getLab(String labName) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                if(!lab.getStatus().equals(LabStatus.PENDING)){
                    throw new UnsupportedOperationException("Not forked");
                }
                else{
                    lab.setStatus(labStatus);
                    return;
                }
                }
            }
        throw new UnsupportedOperationException("Not forked");

    }

    public void forkLab(Lab lab) {
        for(Lab lab1 : labs){
            if(lab1.equals(lab)){
                lab1.setStatus(LabStatus.PENDING);
                return;
            }
        }
        lab.setStatus(LabStatus.PENDING);
        this.labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString(){
        String newString = "";
        Collections.sort(this.labs);
        for(Lab l : labs){
            if(!newString.equals("")){
                newString += "\n";
            }
            newString += l.getName() + " > " + l.getStatus();
        }
        return newString;
    }
}
