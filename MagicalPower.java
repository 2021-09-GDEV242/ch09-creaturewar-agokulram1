
/**
 * Write a description of class MagicalPower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicalPower extends  Creature
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class MagicalPower
     */
    
    protected MagicalPower(int str, int hp, String name) {
      super(str, hp, name);
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  
     public int damage(){
      return super.damage()*2;  
    }
    
}
