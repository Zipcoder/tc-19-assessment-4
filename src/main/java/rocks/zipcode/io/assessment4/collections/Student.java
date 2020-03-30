package rocks.zipcode.io.assessment4.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    HashMap<String, Lab> labMap = new HashMap<>();


    public Student() {

    }

    public Student(List<Lab> labs) {
        for(Lab lab : labs){
            labMap.put(lab.getName(),lab);
        }
    }

    public Lab getLab(String labName) {
            return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab any = this.getLab(labName);
        any.setStatus(labStatus);
        labMap.put(labName,any);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labMap.put(lab.getName(),lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String result = "";
        int truncateIndex = result.length();

        for(Map.Entry<String, Lab> i : labMap.entrySet()){
            result +=  i.getKey() +" > " + getLabStatus(i.getKey())+ "\n";
            truncateIndex = result.length();

            truncateIndex =  result.lastIndexOf('\n', truncateIndex - 1);

        }

        return (result.substring(0, truncateIndex));
    }
}
