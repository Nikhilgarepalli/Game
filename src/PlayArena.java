import java.util.Random;

class PlayArena {
    private Player playerA;
    private Player playerB;

    public PlayArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String play() {
            Player attacker, defender;
            if (playerA.getHealth() < playerB.getHealth())
                attacker = playerA;
            else
                attacker = playerB;

            if (attacker == playerA)
                defender = playerB;
            else
                defender = playerA;

            while (playerA.isAlive() && playerB.isAlive()) {
                int attackRoll = dieRoll();
                int defendRoll = dieRoll();

                int damage = attackRoll * attacker.getAttack();
                int defense = defendRoll * defender.getStrength();

                int damageTaken = Math.max(0, damage - defense);

                defender.reduceHealth(damageTaken);
                System.out.println(defender.getName() + " health reduced by " + damageTaken);

                // Switch roles for the next turn
                Player temp = attacker;
                attacker = defender;
                defender = temp;
            }

            if (!playerA.isAlive()) {
                System.out.println("Player B wins!");
                return playerB.getName();
            } else {
                System.out.println("Player A wins!");
                return playerA.getName();
            }
    }

        public int dieRoll () {
            return (int) (Math.random() * 6 + 1);
        }
}
