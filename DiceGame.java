import java.util.Scanner;

public class DiceGame
{
  public static void main(String[] args)
  {
    Die player1 = new Die();
    Die player2 = new Die();

    Scanner kb = new Scanner(System.in);
    System.out.print("Welcome to the Game of Doubles! How many times do you want to roll dice pairs? ");
    int rolls = kb.nextInt();

    // Count how many doubles each player gets
    int counterA = 0;
    int counterB = 0;
    for (int i = 0; i < rolls; i++)
    {
        int dierollA1 = player1.roll();
        int dierollA2 = player1.roll();
        System.out.println("Player A rolled " + dierollA1 + " and " + dierollA2 + ". ");
        if (dierollA1 == dierollA2)
        {
            counterA++;
        }
    }
    for (int i = 0; i < rolls; i++)
    {
        int dierollB1 = player2.roll();
        int dierollB2 = player2.roll();
        System.out.println("Player B rolled " + dierollB1 + " and " + dierollB2 + ". ");
        if (dierollB1 == dierollB2)
        {
            counterB++;
        }
    }

    System.out.print("Player A rolled " + counterA + " double(s). ");
    System.out.println("Player B rolled " + counterB + " double(s). ");


    if (counterA > counterB) System.out.println("Player A wins!");
    else
    if (counterB > counterA) System.out.println("Player B wins!");
    else System.out.println("It's a tie!");

  }
}