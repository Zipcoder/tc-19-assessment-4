package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus implements Comparable<LabStatus> {
    COMPLETED(1), INCOMPLETE(2), PENDING(3);

    LabStatus(int value){
    }


}
