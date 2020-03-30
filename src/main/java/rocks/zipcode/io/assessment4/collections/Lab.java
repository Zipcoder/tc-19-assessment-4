package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {

    private final String labName;
    private LabStatus status;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return (labName != null) ? labName : "";
    }

    public void setStatus(LabStatus labStatus) {
        this.status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }

    @Override
    public int compareTo(Lab o) {
        return this.status.compareTo(o.getStatus());
    }

}
