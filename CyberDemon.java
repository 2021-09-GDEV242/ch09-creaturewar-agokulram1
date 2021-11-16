
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 25;
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
          super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,
            "CyberDemon"
        ); 
        if (getHealthPoint() > MAX_CYBERDEMON_HP)
          setHealthPoint(MAX_CYBERDEMON_HP);
       if (getHealthPoint() < MIN_CYBERDEMON_HP)
          setHealthPoint(MIN_CYBERDEMON_HP);
       if (getStrength() > MAX_CYBERDEMON_STR)
           setStrength(MAX_CYBERDEMON_STR);
       if (getStrength() > MIN_CYBERDEMON_STR)
           setStrength(MIN_CYBERDEMON_STR);
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
