import java.util.ArrayList;

public class Yacht {
    private ArrayList<Dice> rollingDice;
    private ArrayList<Dice> standingDice;
    private Dice dice1, dice2, dice3, dice4, dice5;
    private Player player1;
    private Player player2;
    private int turnsLeft;
    private int rollsLeft;
    public Yacht() {
        standingDice = new ArrayList<Dice>();
        rollingDice = new ArrayList<Dice>();
        dice1 = new Dice();
        dice2 = new Dice();
        dice3 = new Dice();
        dice4 = new Dice();
        dice5 = new Dice();
        standingDice.add(dice1);
        standingDice.add(dice2);
        standingDice.add(dice3);
        standingDice.add(dice4);
        standingDice.add(dice5);
        player1 = new Player(true);
        player2 = new Player(false);
        turnsLeft = 13;
        rollsLeft = 3;
    }
    public static void main(String[] args) {
//        while(turnsLeft > 0) {
//
//        }
    }

    public void rollDice() {
        for (Dice d : rollingDice) {
            d.roll();
        }
    }
}
