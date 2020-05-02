package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int one;
    private int two;

    private String res;

    public Multiply(int x, int y)
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
