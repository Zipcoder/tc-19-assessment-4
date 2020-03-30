package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs = new ArrayList<> (  );
    String labName;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        Lab labFinder = null;
        for (Lab lab : labs) {
            if (lab.getName () == labName) {
                labFinder = lab;
            }
        }
        return labFinder;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (this.getLab ( labName ) == null) {
            throw new UnsupportedOperationException ();
        }
        getLab(labName ).labStatus = labStatus;
    }


    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).labStatus;
    }

    @Override
    public String toString() {
        StringBuilder labResults = new StringBuilder (  );
        for (int i = labs.size () - 1; i >= 0; i--) {
            labResults.append(labs.get ( i ).getName () + " > " + labs.get ( i ).getStatus () + "\n");
        }
        System.out.println (labResults);
        String result = labResults.toString ();
        return result.trim ();
    }
}
