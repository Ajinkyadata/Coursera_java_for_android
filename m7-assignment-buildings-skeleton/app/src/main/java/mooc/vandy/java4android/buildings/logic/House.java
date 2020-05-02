package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.

    private String mOwner;
    private Boolean mPool;

    public House(int length , int width, int lotlength, int lotwidth)
    {
        super(length , width, lotlength, lotwidth);
        this.mOwner="n/a";
        this.mPool=false;
    }

    public House(int length , int width, int lotlength, int lotwidth, String owner)
    {
        super(length , width, lotlength, lotwidth);
        this.mOwner=owner;
        this.mPool=false;
    }

    public House(int length , int width, int lotlength, int lotwidth, String owner, Boolean pool)
    {
        super(length , width, lotlength, lotwidth);
        this.mOwner=owner;
        this.mPool=pool;
    }

    public String getOwner()
    {
        return this.mOwner;
    }

    public Boolean hasPool()
    {
        return this.mPool;
    }

    public void setOwner(String x)
    {
        this.mOwner=x;
    }

    public void setPool(Boolean x)
    {
        this.mPool=x;
    }

    public String toString()
    {
        String x= "Owner: "+this.getOwner();

        if(this.hasPool())
            x+="; has a pool";

        if(this.calcBuildingArea() < this.calcLotArea())
            x+="; has a big open space";

            return x;
    }

    public Boolean equals( House x)
    {
         if(this.calcBuildingArea()== x.calcBuildingArea() && this.mPool==x.mPool)
             return true;
         else
             return false;
    }
}
