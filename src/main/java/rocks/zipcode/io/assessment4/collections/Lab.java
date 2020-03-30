package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable{
    private String labName;
        LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName= labName;


    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus=labStatus;

    }

    public LabStatus getStatus() {
        return this.labStatus;

}
@Override
public int compareTo(Object o){
    if( o instanceof Lab){
        Lab oLab =(Lab) o;
        return labName.compareTo(oLab.labName);
    }
    return 0;
}

}