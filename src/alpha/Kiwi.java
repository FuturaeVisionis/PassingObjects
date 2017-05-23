package alpha;

/**
 * Created by ronald on 22/10/16.
 */
public class Kiwi {

    public String colour = "Red";
    public int amount = 10;

    public void changeKiwi(Kiwi healthy) { // check out the Kiwi within the parentheses!
        healthy.colour = "Green";
        System.out.println("My kiwi's colour is " + healthy.colour);
    }

    static void regainKiwi(Kiwi juicy) { // check out the Kiwi within your parentheses!
        juicy.colour = "Purple";
        System.out.println("Your kiwi's colour is " + juicy.colour);

    }
    public void eatKiwi(Kiwi eat){
        eat.amount = 5;
        System.out.println("I always eat " + eat.amount + " kiwi's a day.");
    }

    public static void main(String[] args) {
        Kiwi kiwi = new Kiwi();

        kiwi.changeKiwi(kiwi); // passing the object
        regainKiwi(kiwi); // Passing the object
        kiwi.eatKiwi(kiwi); // Passing the object.

    }
}
