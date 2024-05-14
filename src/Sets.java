import java.util.ArrayList;

public class Sets {
    private ArrayList<Dice> diceList = new ArrayList<Dice>();

    public Sets(ArrayList<Dice> diceList) {
        this.diceList = diceList;
    }

    public boolean isOnes() {
        for (Dice dice : diceList) {
            if (dice.getValue() == 1) {
                return true;
            }
        }
        return false;
    }
    public boolean isTwos() {
        for (Dice dice : diceList) {
            if (dice.getValue() == 2) {
                return true;
            }
        }
        return false;
    }
    public boolean isThrees() {
        for (Dice dice : diceList) {
            if (dice.getValue() == 3) {
                return true;
            }
        }
        return false;
    }
    public boolean isFours() {
        for (Dice dice : diceList) {
            if (dice.getValue() == 4) {
                return true;
            }
        }
        return false;
    }
    public boolean isFives() {
        for (Dice dice : diceList) {
            if(dice.getValue() == 5) {
                return true;
            }
        }
        return false;
    }
    public boolean isSixes() {
        for (Dice dice : diceList) {
            if(dice.getValue() == 6) {
                return true;
            }
        }
        return false;
    }
    public boolean isThreeOfKind() { //how to check which one pops up the most
        int counter = 0;
        for (Dice dice : diceList) {
            
        }
        return false;
    }



}
