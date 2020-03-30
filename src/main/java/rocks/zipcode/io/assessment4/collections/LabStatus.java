package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED("COMPLETED"),
    INCOMPLETE("INCOMPLETE"),
    PENDING("PENDING");

    public final String status;


    LabStatus(String value) {
        this.status = value;
    }
}
