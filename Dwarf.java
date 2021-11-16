
/**
 * Write a description of class dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends MagicalPower
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int MAX_DWARF_HP = 10;
    private static final int MIN_DWARF_HP = 5;
    private static final int MAX_DWARF_STR = 20;
    private static final int MIN_DWARF_STR = 5;
    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
    {
        super(
         Randomizer.nextInt(MAX_DWARF_STR-MIN_DWARF_STR)+MIN_DWARF_STR,
         Randomizer.nextInt(MAX_DWARF_HP-MIN_DWARF_HP)+MIN_DWARF_HP,
         "Dwarf"); 
       if (getHealthPoint() > MAX_DWARF_HP)
          setHealthPoint(MAX_DWARF_HP);
       if (getHealthPoint() < MIN_DWARF_HP)
          setHealthPoint(MIN_DWARF_HP);
       if (getStrength() > MAX_DWARF_STR)
           setStrength(MAX_DWARF_STR);
       if (getStrength() > MIN_DWARF_STR)
           setStrength(MIN_DWARF_STR);
    }

    
}
