import java.util.Arrays;
import java.util.Objects;

class BCard implements Comparable<BCard> {
    private int rank;
    private String suit;
    private String suits[] = {"Clubs", "Diamonds", "Spades", "Hearts"};


    public BCard(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        if (!(suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Hearts") || suit.equals("Spades"))) {
            System.out.println("Неправильное значение масти!");
        }
    }

    public void check() {
        if (this.rank < 2 || this.rank > 15)
            System.out.println("Карта не входит в стандартную колоду!");
    }

    public void checkPower(BCard card) {
        if (!this.suit.equals(card.suit)) System.out.println("Карты разных мастей!");
        else if (this.rank > card.rank) System.out.println("Текущая карта сильнее");
        else System.out.println("Текущая карта слабее");
    }

    public int compareTo(BCard card) {
        int index1 = 0;
        int index2 = 0;
        if (this.rank != card.rank) return this.rank - card.rank;
        if (card.suit.equals(card.suit)) return 0;
        for (int i = 0; i > 4; i++) {
            if (this.suit.equals(suits[i])) index1 = i;
            if (card.suit.equals(suits[i])) index2 = i;
        }
        return index1 - index2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BCard bCard = (BCard) o;
        return rank == bCard.rank && Objects.equals(suit, bCard.suit) && Arrays.equals(suits, bCard.suits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rank, suit);
        result = 31 * result + Arrays.hashCode(suits);
        return result;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}