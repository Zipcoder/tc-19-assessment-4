package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    private LabStatus labStatus;


    public String getLabName() {
        return labName;
    }

    public Lab() {

        this.labName = "";
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {

        return this.labName;
    }



    public void setStatus(LabStatus labStatus) {

        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {

        return this.labStatus;
    }
}
