package shapes;

public class Square extends Rectangle{

    // VARS
    protected static int side;

    // CON
    public Square(int side) {
        super(side, side);
        Square.side = side;
    }

    // METHS
    public static int getPerimeter(){
        return side * 4;
    }
    public static int getArea(){
        return side * side;
    }





}  //  <--END
