package rocks.zipcode.io.assessment4.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus labStatus;
    Boolean forked;

    public Lab() {
        this.name = "";
        this.forked = false;
    }

    public Lab(String labName) {
        this.name = labName;
        this.forked = false;
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

    public Boolean getForked() {
        return forked;
    }

    public void setForked(Boolean forked) {
        this.forked = forked;
    }
}
