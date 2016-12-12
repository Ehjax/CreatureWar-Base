import java.util.ArrayList;


/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    private int good;
    private int bad;
    private Randomizer r = new Randomizer();
    
    
    public War(int good, int bad) {
        CreateGoodArmy(good);
        CreateEvilArmy(bad);
        Fight();
    }
    
    
    private void  CreateGoodArmy(int numberGoodSoldiers) {
        for (int i = 0; i < numberGoodSoldiers; i++) {
            if (Randomizer.nextInt(10) < 7) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
        }   
    }
    
       private void  CreateEvilArmy(int numberEvilSoldiers) {
        for (int i = 0; i < numberEvilSoldiers; i++) {
            int temp = Randomizer.nextInt(100);
            if (temp < 75) {
                evilArmy.add(new Demon(50, 50));
            } else if (temp < 97) {
                evilArmy.add(new CyberDemon());
            } else {
                evilArmy.add(new Balrog());
                System.out.println("The Balrog has been summoned");
            }
            }
        }   
    
    public void Fight() {
        
        Creature goodWarrior=null;
        Creature evilWarrior=null;
        do {
            System.out.println("--------");
            if (goodWarrior == null) goodWarrior = goodArmy.remove(0);
            
            if (evilWarrior == null) evilWarrior = evilArmy.remove(0);
            
            while (goodWarrior.isAlive() && evilWarrior.isAlive()){
                evilWarrior.takeDamage(goodWarrior.damage());
                if(evilWarrior.isAlive())
                    goodWarrior.takeDamage(evilWarrior.damage());
                String s="\t";
                s += goodWarrior.getClass();
                s += (goodWarrior.isAlive()? " is standing":" has died");
                s += "\t::\t";
                s += evilWarrior.getClass();
                s += (evilWarrior.isAlive()?  " is standing":" has died");
                System.out.println(s);
            }
            if(!goodWarrior.isAlive()) goodWarrior= null;
            if(!evilWarrior.isAlive()) evilWarrior = null;
                
        } while (goodArmy.size() != 0 && evilArmy.size() != 0) ;
        System.out.println("Good Guys: " + goodArmy.size() + " , Evil Guys: "
            + evilArmy.size());
        
        if (goodArmy.size() > 0) {
            System.out.println ("Let us celebrate our victory!"); 
        } else if (evilArmy.size() > 0) {
            System.out.println ("All Hope is lost");
        } else {
            System.out.println("The only winner is DEATH!");
        }
        
        
    }
    
}

