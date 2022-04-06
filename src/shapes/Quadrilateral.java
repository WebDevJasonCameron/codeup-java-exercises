package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    // F
    protected int length;
    protected int width;

    // CON
    public Quadrilateral(){}
//    public Quadrilateral(int width) {
//        this.width = width;
//    }
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // GETS
    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }

    // SETS
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    // METH
    public int getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }
    public int getPerimeter(int side){
        return side * 4;
    }
    public int getPerimeter(int length, int width){
        return (length * 2) + (width * 2);
    }
    public int getArea() {
        return this.width * this.length;
    }
    public int getArea(int side){
        return side * side;
    }
    public int getArea(int length, int width){
        return this.length * this.width ;
    }

}
