import java.util.Random;

class PlayArena {
    private Player playerA;
    private Player playerB;

    public PlayArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String play() throws InvalidInputException {
        Player attacker, defender;

        if (playerA.getHealth() <= 0 && playerB.getHealth() <= 0) {
            throw new InvalidInputException("Both health values must be greater than zero.");
        }
        //Select the player with the lowest health to initiate the die roll.
            if (playerA.getHealth() < playerB.getHealth())
                attacker = playerA;
            else
                attacker = playerB;

            if (attacker == playerA)
                defender = playerB;
            else
                defender = playerA;

            //checking players alive to continue the game
            while (playerA.isAlive() && playerB.isAlive()) {
                int attackerRoll = dieRoll();
                int defenderRoll = dieRoll();

                int damage = attackerRoll * attacker.getAttack();
                int defense = defenderRoll * defender.getStrength();

                int damageTaken = Math.max(0, damage - defense);

                //Reduce health of the defender accordingly after the fight
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
