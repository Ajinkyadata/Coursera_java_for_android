package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    public static final int HERD=24;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public void simulateHerd(Random rnd)
    {
        int x=this.HERD;
        int sim=10;

        /*Gate rndGate;
        int rndNum = rnd.nextInt(2);

        if(rndNum==0)
            rndGate=mEastGate;
        else
            rndGate=mWestGate;
        */
        int inside=this.HERD;
        int outside=0;
        for(int i=0; i<sim ;i++)
        {
            if(inside==24)
            {
                int outing = rnd.nextInt(inside)+1;
                outside=outing;
                inside=inside-outing;
                mOut.println("There are currently "+inside+" snails in the pen and "+outside+" snails in the pasture");
            }
            else
            {
                //Gate rndGate;
                int rndNum = rnd.nextInt(2);

                if(rndNum==0)
                {
                    if(inside!=0)
                    {
                        int diff=rnd.nextInt(inside)+1;
                        outside=outside+diff;
                        inside=inside-diff;
                        mOut.println("There are currently "+inside+" snails in the pen and "+outside+" snails in the pasture");
                    }
                    else
                    {
                        int diff=rnd.nextInt(outside)+1;
                        inside=inside+diff;
                        outside=outside-diff;
                        mOut.println("There are currently "+inside+" snails in the pen and "+outside+" snails in the pasture");
                    }

                }
                else
                {
                    if(outside!=0)
                    {
                        int diff=rnd.nextInt(outside)+1;
                        inside=inside+diff;
                        outside=outside-diff;
                        mOut.println("There are currently "+inside+" snails in the pen and "+outside+" snails in the pasture");
                    }
                    else
                    {
                        int diff=rnd.nextInt(inside)+1;
                        outside=outside+diff;
                        inside=inside-diff;
                        mOut.println("There are currently "+inside+" snails in the pen and "+outside+" snails in the pasture");
                    }
                }


            }

        }



    }


}
