public class Ch3Ex24 {
    public static void main(String[] args) {
        int rank = (int)(Math.random() * 13);
        int suit = (int)(Math.random() * 4);
        System.out.print("The card you picked is ");
        switch (rank) {
            case 0: System.out.print("Ace"); break;
            case 10: System.out.print("Jack"); break;
            case 11: System.out.print("Queen"); break;
            case 12: System.out.print("King"); break;
            default: System.out.print(rank + 1); // For numbers 2-10
        }
        System.out.print(" of ");
        switch (suit) {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades"); break;
        }
    }
}
