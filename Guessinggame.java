//import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane; 
public class Guessinggame
{
    public static void main(String[] args)
    {
        String guess;
        int i=1;
        int random;
        String game;
        game = "yes";
        JOptionPane.showMessageDialog(null,"You will be having 5 chances to guess the number");
        while (game == "yes")
        {
                int chances=4,guesses = 1;
                Random rand = new Random();
                random = rand.nextInt(100);
                if(random<50)
                {
                    JOptionPane.showMessageDialog(null,"CLUE:'The generated number is less than 50'");
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"CLUE:'The generated number is greater than 50'");  
                }
                int correct = 0;
                while (correct == 0 && i<=5)
                {
                    guess = JOptionPane.showInputDialog("Enter a number that you have guessed.");
                    int num =Integer.valueOf(guess);
                    if (num > random)
                    {
                        JOptionPane.showMessageDialog(null,"Number is high, try something lower,missed a chance !");
                    }
                    else if (num < random)
                    {
                        JOptionPane.showMessageDialog(null,"Number is low, try something higher,missed a chance ");
                    }
                    else 
                        {
                            JOptionPane.showMessageDialog(null,"Number is correct!");
                            correct = 1;
                            break;
                        }
                        JOptionPane.showMessageDialog(null," you have " +chances+ " chances more!");
                        chances--;
                        i++;
                        guesses++;
                }
               
                if(correct==1)
                 {
                    JOptionPane.showMessageDialog(null,"You have guessed in " + guesses + " chances!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You haven't guessed the correct number");
                    }
                game = JOptionPane.showInputDialog("Would you like to play again?");
                }
    }
}