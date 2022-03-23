public class Exercise1 {

    public static int maxRankClubs;
    public static int maxRankSpades;
    public static int maxRankHearts;
    public static int maxRankDiamonds;

    public static void main (String [] args) {
        CCard c1 = new CCard(6,"Clubs");
        CCard c2 = new CCard("Clubs");
        CCard c3 = new CCard(10,"Diamonds");
        CCard c4 = new CCard("Diamonds");

        System.out.println(c1.getRank());
        System.out.println(c2.getRank());
        System.out.println(c3.getRank());
        System.out.println(c4.getRank());
 }
    class ACard{
        int rank;
        String suit;
    }
    class BCard{
        private int rank;
        private String suit;

        public BCard(int rank, String suit){
            this.rank = rank;
            this.suit = suit;
            if (!(suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Hearts") || suit.equals("Spades"))){
                System.out.println("Неправильное значение масти!");
            }
        }
    }
    static class CCard{
        private int rank;
        private String suit;

        public CCard(int rank, String suit){
            this.rank = rank;
            this.suit = suit;
            if (!(suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Hearts") || suit.equals("Spades"))){
                System.out.println("Неправильное значение масти!");
            }
            switch(suit){
                case ("Diamonds"): maxRankDiamonds = rank;
                    break;

                case ("Clubs"): maxRankClubs = rank;
                    break;

                case ("Hearts"): maxRankHearts = rank;
                    break;

                case ("Spades"): maxRankSpades = rank;
                    break;
            }
        }
        public CCard(String suit){
            this.suit = suit;

            switch (suit){

                case ("Diamonds"): this.rank = ++maxRankDiamonds;
                    break;

                case ("Clubs"): this.rank = ++maxRankClubs;
                    break;

                case ("Hearts"): this.rank = ++maxRankHearts;
                    break;

                case ("Spades"): this.rank = ++maxRankSpades;
                    break;
            }
        }

        public int getRank() {
            return rank;
        }

        public String getSuit() {
            return suit;
        }
    }
}
