package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int one;
    private int two;

    private String res;

    public Divide(int x, int y)
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
