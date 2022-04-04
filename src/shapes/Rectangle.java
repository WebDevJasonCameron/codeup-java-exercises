package shapes;

public class Rectangle {


    // FIELDS
    protected static int length;
    protected static int width;

    // CON
    public Rectangle(int length, int width) {
        Rectangle.length = length;
        Rectangle.width = width;
    }

    // GETS
    public static int getLength() {
        return length;
    }
    public static int getWidth() {
        return width;
    }

    // SETS
    public static void setLength(int length) {
        Rectangle.length = length;
    }
    public static void setWidth(int width) {
        Rectangle.width = width;
    }

    // METHS
    public static int getPerimeter(){
        return (length * 2) + (width * 2);
    }
    public static int getArea(){
        return length * width ;
    }

}
