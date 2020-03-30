package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
       return labs.stream().filter(l->l.getName().equals(labName))
                .findFirst().orElse(null);
   }


    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab l = getLab(labName);
        if(l==null){
            throw new UnsupportedOperationException();
        }
        l.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab l : labs){
            if(l.getName().equals(labName)){
                return l.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        labs.sort(Comparator.comparing(Lab::getName));
        return labs.stream()
                .map(l->l.getName() + " > " + l.getStatus() + "\n")
                .collect(Collectors.joining()).trim();
    }
}
