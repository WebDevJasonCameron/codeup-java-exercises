package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    // F
    protected int length;
    protected int width;

    // CON
    public Quadrilateral(){}
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // GETS
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    // SETS
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    // METH
    public int getPerimeter(int length, int width){
        return (length * 2) + (width * 2);
    }
    public int getArea(int length, int width){
        return length * width ;
    }

}
