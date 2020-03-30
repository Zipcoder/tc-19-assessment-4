package rocks.zipcode.io.assessment4.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus labStatus;

    public Lab() {
        this.name = "";
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

    public LabStatus getStatus() throws UnsupportedOperationException {
        return labStatus;
    }

}
