package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.


    private Boolean mSecondFloor;

    public Cottage(int dim, int lotl, int lotw)
    {
        super(dim/2, dim/2, lotl, lotw);
        this.mSecondFloor=false;

    }
    public Cottage(int dim, int lotl, int lotw, String owner, Boolean sf)
    {
        super(dim/2, dim/2, lotl, lotw, owner);
        this.mSecondFloor=sf;
    }

    public Boolean hasSecondFloor() {return this.mSecondFloor; }

    public String toString()
    {
        String x= super.toString();

        if(this.mSecondFloor)
            x+="; is a  two story cottage";
        else
            x+="; si a cottage";

        return x;

    }
    
}

