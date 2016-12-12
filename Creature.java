
/**
 * Abstract class Creature - write a description of the class here
 * 
 * @author Ben Fasinski
 * @version Version 1.0
 */
public abstract class Creature
{
    private int str;
    private int hp;
    
    public Creature (){
        str=10;
        hp=10;       
    }
    
    public Creature (int str, int hp) {
       if(hp>4)
           this.hp = hp;
       else
            System.out.print("Error: Minimum hitpoints is 5.");
            
       if(str>4)
           this.str = str;
       else
            System.out.print("Error: Minimum strength is 5.");
    }
    
    
    
    public int damage(){
        return Randomizer.nextInt(str) + 1;
    }
    
    public boolean isAlive() {
        if ( hp > 0) {
            return true;
        }
        else
            return false;
    
    }
    
        
    public void takeDamage(int damage) {
        hp -= damage;
    }
    
}
