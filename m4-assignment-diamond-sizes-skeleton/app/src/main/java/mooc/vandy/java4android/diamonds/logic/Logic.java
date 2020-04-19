package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int x) {

        // TODO -- add your code here
        int r=2*x+1, c=2*x+2;

        for(int i=0; i<r; i++)
        {


            if(i==0 || i==r-1)
            {
                mOut.print("+");
                for(int j=0; j<c-2; j++)
                    mOut.print("-");
                mOut.println("+");
            }
            else
            {
                if((i>=1 || i<=(r/2)-1) && (i>=(r/2)+1 || i<=r-2))
                {

                    mOut.print("|");
                    //r =>even -- else ==

                    int blank=c/2-i-1;

                    if(blank<0)
                        blank=-1*blank;

                    //System.out.print(" blank "+blank);

                    for(int j=blank; j>0; j--)
                        mOut.print(" ");

                    if(i==x)
                        mOut.print("<");
                    else
                    {
                        if(i<r/2)
                            mOut.print("/");
                        else
                            mOut.print("\\");
                    }

                    for(int k=c-4-(2*blank); k>0; k--)
                        if(i%2==0)
                            mOut.print("-");
                        else
                            mOut.print("=");

                    if(i==x)
                        mOut.print(">");
                    else
                    {
                        if(i<r/2)
                            mOut.print("\\");
                        else
                            mOut.print("/");
                    }

                    for(int j=blank; j>0; j--)
                        mOut.print(" ");

                    mOut.println("|");

                }
                else
                {
                    mOut.print("|");
                    mOut.print("<");

                    for(int j=0; j<c-4; j++)
                        mOut.print("-");

                    System.out.print(">");
                    mOut.println("|");
                }

            }
        }

    }

}
