package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int one;
    private int two;

    private String res;

    public Subtract(int x, int y)
    {
        this.one=x;
        this.two=y;
        this.res=x-y+"";
    }
    public String toString()
    {
        return this.res;
    }
}
