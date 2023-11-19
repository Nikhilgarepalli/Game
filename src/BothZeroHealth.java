
public class BothZeroHealth {
    public static void main(String[] args) throws InvalidInputException{

        try{
           Player playerA = new Player(0, 5, 10, "PlayerA");
           Player playerB = new Player(0, 10, 5, "PlayerB");
           PlayArena  playArena = new PlayArena(playerA, playerB);
           String winner = playArena.play();
        }
        catch (InvalidInputException e){
            System.out.println("Invalid input: " + e);
        }
        catch(Exception e)
        {
            assert false : "Incorrect Exception raised";
        }
    }

}
