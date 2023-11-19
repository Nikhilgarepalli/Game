import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Player A Health");
            int aHealth = sc.nextInt();
            System.out.println("Enter Player A Strength");
            int aStrength = sc.nextInt();
            System.out.println("Enter Player A Attack");
            int aAttack = sc.nextInt();
            System.out.println("Enter Player B Health");
            int bHealth = sc.nextInt();
            System.out.println("Enter Player B Strength");
            int bStrength = sc.nextInt();
            System.out.println("Enter Player B Attack");
            int bAttack = sc.nextInt();


            //Setting name for each player for easy reference in future use cases
            Player playerA = new Player(aHealth, aStrength, aAttack, "PlayerA");
            Player playerB = new Player(bHealth, bStrength, bAttack, "PlayerB");

            PlayArena playArena = new PlayArena(playerA, playerB);
            playArena.play();
        }
        catch (InvalidInputException e)
        {
            System.out.println("Invalid input: " + e);
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}