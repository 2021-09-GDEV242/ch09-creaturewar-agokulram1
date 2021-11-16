
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Crosbie, Gokul 
 * @version 2020-10 v1.0
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    private String creatureName;
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
        creatureName = "Unknown";
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    protected Creature (int cstr, int chp, String name) {
      str = cstr;
      hp = chp;
      max_hp = 10;
      creatureName = name;
    }
    
    protected String getCreatureName(){
        return creatureName;
    }
    
    protected void setCreatureName(String name){
        creatureName = name;
    }
    
     protected void setHealthPoint(int php){
         hp = php;
    }
    
    protected void setStrength(int pstr){
        str = pstr;
    }
    
    protected int getHealthPoint(){
        return hp;
    }
    
    protected int getStrength(){
        return str;
    }
    /**
     * Creating a damage number between 1 and strength
     */
    public int damage() {
       return Randomizer.nextInt(str);
    
    }
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        return Randomizer.nextInt(str);

    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        return (hp > 0);
    }
    /**
     * @return hp number of hit points in private field
     */
    public int getHealth() {
       return hp;
    }
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        return (hp <= 0);
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        hp = hp - damage;
    }
    
}
