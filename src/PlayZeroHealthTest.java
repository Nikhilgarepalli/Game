public class PlayZeroHealthTest {
    public static void main(String[] args) {
        //Initializing player objects to satisfy play Arena object creation
        Player playerA = new Player(0,5,10, "PlayerA");
        Player playerB = new Player(100,10,5, "PlayerB");
        PlayArena playArena = new PlayArena(playerA, playerB);
        try {
            String winner = playArena.play();
            System.out.println(winner);
            assert (winner == playerB.getName()) : "Incorrect Player Won the Game";

            playerA = new Player(100, 5, 10, "PlayerA");
            playerB = new Player(0, 10, 5, "PlayerB");
            playArena = new PlayArena(playerA, playerB);
            winner = playArena.play();
            System.out.println(winner);
            assert (winner == playerA.getName()) : "Incorrect Player Won the Game";

            playerA = new Player(0, 5, 10, "PlayerA");
            playerB = new Player(0, 10, 5, "PlayerB");
            playArena = new PlayArena(playerA, playerB);
            winner = playArena.play();
        }
        catch (Exception e){
            System.out.println(" both zero");}

    }
}
