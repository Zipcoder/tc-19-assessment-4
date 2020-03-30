package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {
    private String labName;
    private LabStatus labStatus;
    public Lab() {

        this("");
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {

        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {

        return labStatus;
    }


    @Override
    public int compareTo(Lab o) {
        return this.labStatus.compareTo(o.getStatus());
    }
}
