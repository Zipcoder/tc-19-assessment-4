package rocks.zipcode.io.assessment4.collections;

import com.sun.org.apache.xerces.internal.util.Status;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName = "";
    private Status labStatus;


    public Lab() {
        this.labName = "";
        this.labStatus = labStatus;
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        //this.labStatus = status;
    }

    public LabStatus getStatus() {
        return LabStatus.PENDING;
    }
}
