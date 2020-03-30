package rocks.zipcode.io.assessment4.collections;


import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labList = new ArrayList<>();


    public Student() {
    }

    public Student(List<Lab> labs) {
        this.labList.addAll(labs);
    }


    public Lab getLab(String labName) {
        for (int i = 0; i < labList.size() ; i++) {
            if (labList.get(i).getName() == labName){
                return labList.get(i);
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);

    }

    public void forkLab(Lab lab) {
        labList.add(lab);
        lab.setStatus(LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }
    @Override
    public String toString() {
        String result = "";
        for (Lab labs: labList) {
            result += labs.getName() + " > " + labs.getStatus() + "\n";
        }return result;
    }
}
