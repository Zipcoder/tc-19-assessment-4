package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    //ADD_ENUMERATIONS_HERE;
    COMPLETED("COMPLETED"),
    INCOMPLETE("INCOMPLETE"),
    PENDING("PENDING");
    String labStatus;

    LabStatus(String labStatus) {
        this.labStatus = labStatus;
    }
}
