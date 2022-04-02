import java.util.Scanner;
import java.util.Random;

public class rps
{
    public static void main(String[] args)
    {
        char check='Y';
        int count=0;
        do
        {
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            System.out.println("--------------Game-Starts-----------------");
            System.out.println("-----0=Rock-----1=Paper-----2=Scissor-----");
            System.out.print("\nEnter Your choice : ");
            int userInput = input.nextInt();
            int compInput = random.nextInt(3);
            System.out.println("Computer choice : " + compInput);
            if (userInput == compInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1) {
                System.out.println("You Win");
            } else {
                System.out.println("Computer Wins");
            }
            count++;
            System.out.print("Do you want to play again ? (Y/N) : ");
            check = input.next().charAt(0);
        }while(check=='Y' || check=='y');
        System.out.printf("\nYou played %d times",count);
        System.out.println("--------------Game-ends-------------------");
    }
}
