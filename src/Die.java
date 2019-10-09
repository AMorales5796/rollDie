import java.util.Random;
import java.util.Scanner;

public class Die
{
    int numSides;
    int roll;
    public Die()
    {
        numSides = 0;
    }//end of default constructor

    public Die(int newNumSides)
    {
        numSides = newNumSides;
    }

    public String roll()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number of sides that you want the dice to have?");
        numSides = scan.nextInt();
        Random generator = new Random();
        roll = generator.nextInt(numSides);
        return "The total number of sides were " + numSides + " and the side it landed on was: " + roll;
    }
}//end class Die
