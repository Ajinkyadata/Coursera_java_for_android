package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int one;
    private int two;

    private String res; //this variable will store the result in string format

    public Multiply(int x, int y) //using constructor to initialise operands and result
    {
        this.one=x;
        this.two=y;
        this.res=x*y+"";
    }

    public String toString()
    {
        return this.res;
    }
}
