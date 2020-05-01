package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    public void setCorralGates(Gate[] gate, Random rnd)
    {
        for(int i=0; i<gate.length; i++)
        {
            gate[i].setSwing(rnd.nextInt(2)-1);
        }
    }

    public Boolean anyCorralAvailable(Gate[] corral)
    {
       /* for(int i=0; i<corral.length; i++)
        {
            int x=corral[i].getSwingDirection();
            if(x==1)
                return true;
        }
        return false;*/
       int i=0;

       do
           {
               int x=corral[i].getSwingDirection();
               if(x==1)
                   return true;
               i++;
           }while(i<corral.length);
        return false;
    }

    public int corralSnails(Gate[] corral,Random rnd)
    {
        //int sim=;

        int outs=5;
        int attem=0;

        while(outs!=0)
        {
            attem++;
              int x=rnd.nextInt(outs)+1;
              int rndNum=  rnd.nextInt(4);
              Gate g= corral[rndNum];
              outs+= -g.thru(x);
              mOut.println(outs+" are trying to move through corral "+rndNum );
        }
        mOut.println("It took "+attem+" attempts to corral all of the snails.");

        return attem;

    }

    // TODO -- Fill your code in here

}
