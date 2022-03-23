import java.util.Arrays;
import java.util.Objects;

public class Exercise2 {

    public static void main(String[] args) {
        BCard first = new BCard(3, "Diamonds");
        BCard second = new BCard(5, "Clubs");


        System.out.println(first.compareTo(second));
    }
}
