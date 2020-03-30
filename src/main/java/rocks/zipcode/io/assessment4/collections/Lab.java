package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    private LabStatus labStatus;
    private String name;

    public Lab() {
        this("");
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
