package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED(1),
    INCOMPLETE(2),
    PENDING(3);

    private final int value;

    LabStatus(int value) { this.value = value; }

    public int getValue() { return value; }
}
