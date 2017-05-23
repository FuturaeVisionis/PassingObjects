package creta;

/**
 * Created by ronald on 08/01/17.
 */
public class Rectangle {

    int length;
    int width;

    public Rectangle(int l, int b) {
        length = l;
        width = b;
    }

    void area(Rectangle r1) {
        int areaOfRectangle = r1.length + r1.width;
        System.out.println("Area is rectangle: " + areaOfRectangle);
    }

    public void multiple(Rectangle a, int b, char c, boolean p, int...hoela){

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20); // rectangle refers to this new Object
        rectangle.area(rectangle);

        /**
         * You pass the reference variable (which refers to the new Object)
         * into the method containing the Class as a parameter!! This is called, Passing an object into a parameter.
         *
         * Remember, a class is a blue from which an object is created.
         */
    }
}
