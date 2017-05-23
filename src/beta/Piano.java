package beta;

/**
 * Created by ronald on 22/10/16.
 */
public class Piano {

    int keys;
    String name;

    public static void steinbach(Piano s){ // check out piano within the parentheses
        s.keys = 88;
        s.name = "Armstrong.";
        System.out.println("My piano has " + s.keys + " and is called a " + s.name);
    }

    public static void main(String[] args) {

        Piano piano = new Piano();

        piano.name = "Frederick, Altenburg.";
        piano.keys = 99;

        System.out.println("My piano has " + piano.keys + " and is called a " + piano.name);

        steinbach(piano); // passing the object. Is nothing more than running the method.

        System.out.println("My piano has " + piano.keys + " and is called a " + piano.name);


    }
}

