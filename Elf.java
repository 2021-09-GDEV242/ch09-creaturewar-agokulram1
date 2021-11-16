
/**
 * Elves- The eldest and noblest of the speaking races of Middle-Earth. The Elves flourished in the First Age, but by the Third their power was waning.
 * Some of the refuges of Elves during the Third Age include Lindon, Imladris (Rivendell), the Woodland Realm of Mirkwood, and Lorien. 
 * Elves are about six feet tall and somewhat slender, graceful yet strong, and resistant to the extremes of nature. 
 * They do not die naturally, but can be killed. The Elves had the Three Rings of Power, which were given to the three greatest of the Eldar.
 * The Elves called themselves 'Quendi', which in Quenya means "the Speakers." They have also been called the Elder Kindred, the Elder Race, 
 * the Elder People, the Fair Folk, and the Firstborn.
 *
 * @author Gokul
 * @version 11.13.21
 */
public class Elf extends MagicalPower
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
         super(
         Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
         Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,
         "Elf"); 
         if (getHealthPoint() > MAX_ELF_HP)
          setHealthPoint(MAX_ELF_HP);
       if (getHealthPoint() < MIN_ELF_HP)
          setHealthPoint(MIN_ELF_HP);
       if (getStrength() > MAX_ELF_STR)
           setStrength(MAX_ELF_STR);
       if (getStrength() > MIN_ELF_STR)
           setStrength(MIN_ELF_STR);
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
