
/**
 * Write a description of class Crebrain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crebrain extends Animals
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int MAX_CREBRAIN_HP = 100;
    private static final int MIN_CREBRAIN_HP = 25;
    private static final int MAX_CREBRAIN_STR = 40;
    private static final int MIN_CREBRAIN_STR = 25;
    /**
     * Constructor for objects of class Crebrain
     */
    public Crebrain()
    {
        super(
         Randomizer.nextInt(MAX_CREBRAIN_STR-MIN_CREBRAIN_STR)+MIN_CREBRAIN_STR,
         Randomizer.nextInt(MAX_CREBRAIN_HP-MIN_CREBRAIN_HP)+MIN_CREBRAIN_HP,
         "Crebrain");
       if (getHealthPoint() > MAX_CREBRAIN_HP)
          setHealthPoint(MAX_CREBRAIN_HP);
       if (getHealthPoint() < MIN_CREBRAIN_HP)
          setHealthPoint(MIN_CREBRAIN_HP);
       if (getStrength() > MAX_CREBRAIN_STR)
           setStrength(MAX_CREBRAIN_STR);
       if (getStrength() > MIN_CREBRAIN_STR)
           setStrength(MIN_CREBRAIN_STR);
    }

    /**
     * 10% chance to do magical damage (2x damage returned) [override the damage method,
     * get base damage from creature and apply bonus]
     *
     * @return the damage
     */
    public int damage(){
        return super.damage();  
    }
}
