package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here

    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;
    private int mSwing;

    public Gate()
    {
        mSwing=CLOSED;
    }

    public Boolean setSwing(int dir)
    {
        if(dir==0 || dir==-1 || dir==1)
        {
            this.mSwing=dir;
            return true;
        }
        else
            return false;
    }

    public Boolean open(int sdir)
    {
        if(sdir==OUT || sdir==IN)
        {
            return this.setSwing(sdir);
        }
        else
            return false;
    }

    public void close()
    {
        this.setSwing(CLOSED);
    }

    public int getSwingDirection()
    {
        return this.mSwing;
    }

    public int thru(int count)
    {
        return this.getSwingDirection()*count;
    }

    public String toString()
    {
        String xx;
        int x=this.mSwing;

        if(x==this.CLOSED)
            xx="This gate is Closed";
        else if(x==this.OUT)
            xx="This gate is open and swings to exit the pen only";
        else if(x==this.IN)
            xx="This gate is open and swings to enter the pen only";
        else
            xx="This gate has an invalid swing direction";

        return xx;
        //System.out.print("");
    }

}
