package shapes;

public class Square extends Quadrilateral implements Measurable{

    // F
    protected int side;

    // CON
    public Square() {
        super();
    }
    public Square(int side) {
        super(side, side);
    }
    // O GETS

    // O SETS

    // O METH







    /**
     * PRIOR CLASS WORK
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
    */
}  //  <--END
