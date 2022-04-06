package shapes;

public class Square extends Quadrilateral implements Measurable{

    // F
    private int side;

    // CON
    public Square() {
        super();
    }
    public Square(int side) {
        super(side, side);
    }
    // O GETS


    // O SETS
    public void setLength(int length){
           this.length = length;
           this.width = length;
    }
    public void setWidth(int width){
        this.length = width;
        this.width = width;
    }

    // O METH
    @Override
    public int getPerimeter() {
        return this.side * 4;
    }
    @Override
    public int getPerimeter(int length, int width) {
        return (length * 2) + (width * 2);
    }
    @Override
    public int getArea() {
        return length * width;
    }
    @Override
    public int getArea(int side) {
        return length * width;
    }


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
