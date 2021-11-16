
/**
 * Write a description of class Animals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animals extends Creature
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Animals
     */
    protected Animals(int str, int hp, String aName) {
      super(str, hp, aName);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
