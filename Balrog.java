
/**
 * Write a description of class Bulrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
   
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
     * Constructor for objects of class Bulrog
     */
    public Balrog()
    {
       super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,
            "Balrog"
        ); 
       if (getHealthPoint() > MAX_BALROG_HP)
          setHealthPoint(MAX_BALROG_HP);
       if (getHealthPoint() < MIN_BALROG_HP)
          setHealthPoint(MIN_BALROG_HP);
       if (getStrength() > MAX_BALROG_STR)
           setStrength(MAX_BALROG_STR);
       if (getStrength() > MIN_BALROG_STR)
           setStrength(MIN_BALROG_STR);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage() {
        int baldamage = super.damage()+super.damage();
        return baldamage; 
        
    }
}
