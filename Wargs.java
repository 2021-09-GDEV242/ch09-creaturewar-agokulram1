
/**
 * Write a description of class Wargs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wargs extends Animals
{
    private static final int MAX_WARGS_HP = 25;
    private static final int MIN_WARGS_HP = 8;
    private static final int MAX_WARGS_STR = 18;
    private static final int MIN_WARGS_STR = 5;

    /**
     * Constructor for objects of class Wargs
     */
    public Wargs()
    {
      super(
         Randomizer.nextInt(MAX_WARGS_STR-MIN_WARGS_STR)+MIN_WARGS_STR,
          Randomizer.nextInt(MAX_WARGS_HP-MIN_WARGS_HP)+MIN_WARGS_HP,
          "Wargs");   
       if (getHealthPoint() > MAX_WARGS_HP)
          setHealthPoint(MAX_WARGS_HP);
       if (getHealthPoint() < MIN_WARGS_HP)
          setHealthPoint(MIN_WARGS_HP);
       if (getStrength() > MAX_WARGS_STR)
           setStrength(MAX_WARGS_STR);
       if (getStrength() > MIN_WARGS_STR)
           setStrength(MIN_WARGS_STR);
    }

 
       
}
