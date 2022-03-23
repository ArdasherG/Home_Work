import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck {
    static ArrayList<BCard> deck;
    static String suits[] = {"Clubs", "Diamonds", "Spades", "Hearts"};
    static int rank;

    public static void main(String[] args) {


    }
    private Deck() {

    }
        static void deck(){

            deck = new ArrayList<>();

            for(int i = 2; i < 15; i++){
                for(String suit: suits){
                   deck.add(new BCard(i,suit));
                }
            }
        }
        static BCard randomCard(ArrayList<BCard> deck){
            return deck.get(new Random().nextInt(deck.size()));
        }

        public void mixingCard(ArrayList<BCard> deck){
            Collections.shuffle(deck);
        }
        public void distributionOfCards (int rank, String suit){
            for (BCard card:deck) {
                if(card.getRank() == rank && card.getSuit().equals(suit)){
                    deck.remove(card);
                    return;
                }
            }
        }
        public BCard returnCardToDeck(int rank, String suit){
            for (BCard card:deck){
                if(card.){

                }
            }

        }
    }


