import java.util.Random;

/**
 * Write a description of class Randomizer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Randomizer
{
    // instance variables - replace the example below with your own
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int nextInt(int y)
    {
        return rand.nextInt(y);
    }
}
