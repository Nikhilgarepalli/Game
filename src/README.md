**Game Rules**
Each player is defined by three attributes: health, strength, and attack.
Players take turns attacking, rolling dice to determine the outcome of their attacks and defenses.
The game continues until one player's health reaches 0.

**Code Structure**
Player.java: Defines the Player class with attributes and methods.
PlayArena.java: Manages the game logic, including player turns and dice rolling.
Main.java: Contains the main method to start the game.

**How to Play**
Two players are created with initial attributes.
Entering the players health,strength, and attack values by user interface.
Players take turns attacking each other until one loses all their health.
The game announces the winner.

**ToExecute**
javac Main.java
java Main

**Input Format**:
Enter Player A Health
50
Enter Player A Strength
5
Enter Player A Attack
10
Enter Player B Health
100
Enter Player B Strength
10
Enter Player B Attack
5

**Output Format**:

PlayerB health reduced by 40
PlayerA health reduced by 0
PlayerB health reduced by 10
PlayerA health reduced by 0
PlayerB health reduced by 10
PlayerA health reduced by 0
PlayerB health reduced by 0
PlayerA health reduced by 10
PlayerB health reduced by 10
PlayerA health reduced by 0
PlayerB health reduced by 30
Player A wins!


**Unit Tests**
To enable assertions during runtime, you need to set JVM configuration -ea while running.
java -ea (testclassfilename.java).




