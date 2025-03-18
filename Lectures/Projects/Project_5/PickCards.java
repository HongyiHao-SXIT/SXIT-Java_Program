package Project_5;
public class PickCards {
    public static void main(String[] args) {
        int card = (int) (Math.random() * 52);
        String suit = "", rank = "";
        suit = switch (card / 13) {
            case 0 -> "Spades";
            case 1 -> "Hearts";
            case 2 -> "Diamonds";
            case 3 -> "Clubs";
            default -> "";
        };
        rank = switch (card % 13) {
            case 0 -> "A";
            case 10 -> "J";
            case 11 -> "Q";
            case 12 -> "K";
            default -> "" + (card % 13 + 1);
        };
        System.out.println("The card you drew is: " + rank + " of " + suit);
    }
}    