
public class RandomDieRollTest {

    public static void main(String[] args) {
        //Initializing player objects to satisfy play Arena object creation
        Player playerA = new Player(50,5,10, "PlayerA");
        Player playerB = new Player(100,10,5, "PlayerB");
        PlayArena playArena = new PlayArena(playerA, playerB);
        int rollValue = playArena.dieRoll();
        assert(rollValue < 7): "Die roll value is incorrect";
    }
}
