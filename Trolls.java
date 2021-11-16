
/**
 * Write a description of class Trolls here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trolls extends Demon
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int MAX_TROLLS_HP = 130;
    private static final int MIN_TROLLS_HP = 25;
    private static final int MAX_TROLLS_STR = 80;
    private static final int MIN_TROLLS_STR = 30;
    /**
     * Constructor for objects of class Trolls
     */
    public Trolls()
    {
        super(
        Randomizer.nextInt(MAX_TROLLS_STR-MIN_TROLLS_STR)+MIN_TROLLS_STR,
        Randomizer.nextInt(MAX_TROLLS_HP-MIN_TROLLS_HP)+MIN_TROLLS_HP,
        "Trolls"
        ); 
       if (getHealthPoint() > MAX_TROLLS_HP)
          setHealthPoint(MAX_TROLLS_HP);
       if (getHealthPoint() < MIN_TROLLS_HP)
          setHealthPoint(MIN_TROLLS_HP);
       if (getStrength() > MAX_TROLLS_STR)
           setStrength(MAX_TROLLS_STR);
       if (getStrength() > MIN_TROLLS_STR)
           setStrength(MIN_TROLLS_STR);
    }

     
}
