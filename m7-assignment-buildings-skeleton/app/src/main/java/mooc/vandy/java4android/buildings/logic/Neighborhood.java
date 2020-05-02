package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    public static void print(Building[] bdg, String hdr, OutputInterface out)
    {
        for(int i=0; i<bdg.length; i++)
            bdg[i].toString();
    }

    public static int calcArea(Building[] bdg)
    {
        int ans=0;
        for(int i=0; i<bdg.length; i++)
            ans+=(bdg[i].calcBuildingArea()); //+ bdg[i].calcLotArea());

        return ans;

    }
    
}
