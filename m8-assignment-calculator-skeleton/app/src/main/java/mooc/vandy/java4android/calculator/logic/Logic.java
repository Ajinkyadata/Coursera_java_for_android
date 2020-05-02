package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    private static final int add=1;
    private static final int sub=2;
    private static final int mul=3;
    private static final int div=4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here



        if(operation==add)
        {
            Add res= new  Add(argumentOne, argumentTwo);
            mOut.print(res.toString());
        }
        else if(operation==sub)
        {
            Subtract res=new Subtract(argumentOne, argumentTwo);
            mOut.print(res.toString());
        }
        else if(operation==mul)
        {
            Multiply res= new Multiply(argumentOne, argumentTwo);
            mOut.print(res.toString());
        }
        else if(operation==div)
        {
            Divide res=new Divide(argumentOne, argumentTwo);
            mOut.print(res.toString());
        }







    }
}
