package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.

    private String mBusinessName;
    private int mParkingSpaces ;
    private static int sTotalOffices=0;

    public Office(int len, int wid, int lotl, int lotw)
    {
        super(len, wid, lotl, lotw);
        this.mBusinessName=null;
        this.mParkingSpaces=0;
        this.sTotalOffices+=1;
    }

    public Office(int len, int wid, int lotl, int lotw, String bname)
    {
        super(len, wid, lotl, lotw);
        this.mBusinessName=bname;
        this.mParkingSpaces=0;
        this.sTotalOffices+=1;
    }

    public Office(int len, int wid, int lotl, int lotw , String bname, int pksp)
    {
        super(len, wid, lotl, lotw);
        this.mBusinessName=bname;
        this.mParkingSpaces=pksp;
        this.sTotalOffices+=1;
    }

    public String getBusinessName(){ return this.mBusinessName; }
    public int getParkingSpaces(){ return this.mParkingSpaces; }
    public void setBusinessName(String x) { this.mBusinessName=x; }
    public void setParkingSpaces(int x) {this.mParkingSpaces=x; }
    public String toString()
    {
        String x="Business: ";

        if(this.getBusinessName()==null)
            x+="unoccupied";
        else
            x+=this.mBusinessName;

        if(this.getParkingSpaces()!=0)
            x+="; has "+this.getParkingSpaces()+" parking spaces";

        x+=" (total offices: "+this.sTotalOffices+")";

        return x;

    }

    public Boolean equals(Office x)
    {
        if(this.calcBuildingArea()== x.calcBuildingArea() && this.getParkingSpaces()==x.getParkingSpaces())
            return true;
        else
            return false;
    }

}
