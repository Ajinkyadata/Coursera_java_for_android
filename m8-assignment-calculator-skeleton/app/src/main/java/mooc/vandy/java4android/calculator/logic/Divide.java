package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int one;
    private int two;

    private String res; //this variable will store the result in string format

    public Divide(int x, int y) //using constructor to initialise operands and result
    {
        this.one=x;
        this.two=y;

        String xx= "";

        xx+= x/y+" R: "+x%y ;

        this.res=xx;
    }

    public String toString()
    {
        return res;
    }
}
