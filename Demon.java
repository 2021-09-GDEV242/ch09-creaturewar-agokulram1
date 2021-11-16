
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  Demon extends Creature
{


    /**
     * Constructor for objects of class Demon
     */
       
    protected Demon(int str, int hp, String cname) {
      super(str, hp, cname);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage(){
      return super.damage()+50;  
    }
}
