package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int length, int width, int lotlength, int lotwidth)
    {
        this.mLength=length;
        this.mWidth=width;
        this.mLotLength=lotlength;
        this.mLotWidth=lotwidth;
    }

    public int getLength() { return this.mLength;  }
    public int getWidth() {return this.mWidth;  }
    public int getLotLength() {return this.mLotLength; }
    public int getLotWidth() {return this.mLotWidth; }
    public void setLength(int x) { this.mLength=x; }
    public void setWidth(int x) { this.mWidth=x; }
    public void setLotLength(int x) {this.mLotLength=x; }
    public void setLotWidth(int x) { this.mLotWidth=x; }
    public int calcBuildingArea()
    {
        return mLength*mWidth;
    }
    public int calcLotArea()
    {
        return mLotLength * mLotWidth;
    }
    public String toString()
    {
        return "";
    }



}
