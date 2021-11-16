import java.util.ArrayList;

/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FinalBattle
{
    ArrayList<Creature> armyOne = new ArrayList<Creature>();
    ArrayList<Creature> armyTwo = new ArrayList<Creature>();

    /**
     * Constructor for objects of class Battle
     */
    public FinalBattle()
    {
       prepareArmies();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void prepareArmies(){
        if ((armyOne.size() >0) && (armyTwo.size()>0)) {
           System.out.println("The armies are ready for the Battle, call charge()");
           return;
        }
        setupArmyOne();
        setupArmyTwo();
        System.out.println("Ready for Battle, Waiting for the \"Charge\"");
        System.out.println("urh, urh, urh, urh, wooo, wooo, wooo, urh, arh (Battle Cries)");
    }

    /**
     * Setup the Army for Good Guys, who are Human, Magical Power Creatures, 
     * 100 creatures
     */
    private void setupArmyOne(){
        armyOne.clear();
        System.out.println("Setting up Army One : Creature Type: Healthpoints:Strength");
        int rand, huctr=0, elfctr=0, dctr=0;
        for (int i= 0; i < 100; i++){
            System.out.print(i);
            rand = Randomizer.nextInt(10);
            if (rand >= 1 && rand <= 6) {
                huctr++;
                armyOne.add(new Human());
                System.out.print(".Human: ");
            }
            if (rand >=7 && rand <= 8) {
                armyOne.add(new Elf());
                elfctr++;
                System.out.print(".Elf: ");
            }
            if (rand >=9 && rand <= 10) {
                armyOne.add(new Dwarf());
                dctr++;
                System.out.print(".Dwarf: ");
                }
            System.out.print(armyOne.get(i).getHealthPoint()+":"+armyOne.get(i).getStrength()+"  ");
        }
        System.out.println();
        System.out.println("Army One is Ready!!! Humans: "+huctr+" Elves: "+elfctr+" Dwarves: "+dctr);
}
    
    /**
     * Setup the Army for Bad Guys, who are CyberDemons, Balrogs, Humans
     */
    private void setupArmyTwo(){
        armyTwo.clear();
        int rand, cdctr=0, blctr=0, humanctr=0 ;
        System.out.println("Setting up Army Two : Creature Type: Healthpoints:Strength");
        for (int i= 0; i < 50; i++){
            System.out.print(i);
            rand = Randomizer.nextInt(25);
            if (rand >= 1 && rand <= 18)
              { armyTwo.add(new Human());
                humanctr++;
                System.out.print(".Human:");}
            if (rand >=19 && rand <= 24) {
                armyTwo.add(new CyberDemon());
                cdctr++;
                System.out.print(".CyberDemon:");
                }
            if (rand == 25) {
                armyTwo.add(new Balrog());
                blctr++;
                System.out.print(".Balrog:");
                }
             System.out.print(armyTwo.get(i).getHealthPoint()+":"+armyTwo.get(i).getStrength()+"  ");    
        }
        System.out.println();
        System.out.println("Army Two is Ready!!! Humans: "+humanctr+" Balrogs: "+blctr+" CyberDemons: "+cdctr);
    }
    
    /**
     * Charge Method will begin the war 
     */
    
    public void Charge() {
        if ((armyOne.size() <=0) || (armyTwo.size()<=0)) {
           System.out.println("The armies are not ready for the Battle, call prepareArmies()");
           return;
        }
        int soldier1idx=0, soldier2idx=0, attackchance;
        Creature armyOneSoldier, armyTwoSoldier;
        armyOneSoldier = armyOne.get(soldier1idx);
        armyTwoSoldier = armyTwo.get(soldier2idx);
        while (true) {
            if (armyOneSoldier.isKnockedOut())
              soldier1idx = Randomizer.nextInt(armyOne.size())-1;
            armyOneSoldier = armyOne.get(soldier1idx);
            if (armyTwoSoldier.isKnockedOut())
              soldier2idx = Randomizer.nextInt(armyTwo.size())-1;
            armyTwoSoldier = armyTwo.get(soldier2idx);
            
            // While Look for the Battle between 2 creatures
            while (armyOneSoldier.isAlive() && armyTwoSoldier.isAlive()) {
                attackchance = Randomizer.nextInt(100);
                if (attackchance <= 57) {
                  armyTwoSoldier.takeDamage(armyOneSoldier.damage()); 
                  System.out.println("A1 "+armyOneSoldier.getCreatureName()+" attacks A2 "+armyTwoSoldier.getCreatureName());
                }
               else
               {
                armyOneSoldier.takeDamage(armyTwoSoldier.damage()); 
                System.out.println("A2 "+armyTwoSoldier.getCreatureName()+" attacks A1 "+armyOneSoldier.getCreatureName());
                 }
            if (armyOneSoldier.isKnockedOut()) {
                armyOne.remove(soldier1idx);
                System.out.println("A1 "+armyOneSoldier.getCreatureName()+
                 " Died! HP: "+armyOneSoldier.getHealthPoint()+ " Strength: "+armyOneSoldier.getStrength());
                }
            else 
                System.out.println("A1: HP: "+armyOneSoldier.getHealthPoint()+ " Strength: "+armyOneSoldier.getStrength());
             if (armyTwoSoldier.isKnockedOut()) {
                armyTwo.remove(soldier2idx);
                System.out.println("A2 "+armyTwoSoldier.getCreatureName()+
                " Died! HP: "+armyTwoSoldier.getHealthPoint()+ " Strength: "+armyTwoSoldier.getStrength());
             }
            else 
                System.out.println("A2: HP: "+armyTwoSoldier.getHealthPoint()+ " Strength: "+armyTwoSoldier.getStrength());
           }
            System.out.println("Army One is now "+armyOne.size()+" strong");
            System.out.println("Army Two is now "+armyTwo.size()+" strong");
            if ((armyOne.size()==0) || (armyTwo.size()==0))
                    break;
    }
    System.out.println("War is over, Army One has "+armyOne.size()+" Army two has "+armyTwo.size());
    if (armyOne.size() > armyTwo.size())
        System.out.println("Army One has won the war!!!");
    else
        System.out.println("Army Two has won the war!!!");
  }
}
