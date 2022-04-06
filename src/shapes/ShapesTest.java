package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Measurable myShape = new Square(2);
//        System.out.println("Square with each side being 2 has an area of: " + myShape.getArea());
//        System.out.println("Square with each side being 2 has an parameter of: " + myShape.getPerimeter());

//        System.out.println("get the width of my sape:  " + myShape.getwidth());       //<-- BREAKS! ONE SIDE!

//        Measurable myRec = new Rectangle(4, 6);
//        System.out.println("Rec with w at 4 and l at 6. The area is: " + myRec.getArea(myRec.getWidth(), myRec.getLength()));
//        System.out.println("Rec with w at 4 and l at 6. The area is: " + myRec.getPerimeter(myRec.getWidth(), myRec.getLength()));

//        Rectangle newRec = new Rectangle(3,4);
//        System.out.println("new rec length: " + newRec.getLength());
//        System.out.println("new rec width: " + newRec.getWidth());
//        System.out.println("new rec area is: " + newRec.getArea());
//        System.out.println("new rec perimeter is: " + newRec.getPerimeter());
//
//        newRec.setLength(5);
//        System.out.println("new rec length: " + newRec.getLength());

        Square newSq = new Square(18);
        System.out.println("new square width and length are: " + newSq.getWidth());
        System.out.println("new square length and length are: " + newSq.getLength());
        System.out.println("new square area is: " + newSq.getArea());
        System.out.println("new square perimeter is: " + newSq.getPerimeter());




        /**
         * PRIOR CLASS WORK
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("box1 perimeter is: " +  box1.getPerimeter());
        System.out.println("box1 area is: " +  box1.getArea());

        System.out.println();

        Square box2 = new Square(5);
        System.out.println("box2 perimeter is: " +  box2.getPerimeter());
        System.out.println("box2 area is: " +  box2.getArea());
         */
    }  //  <--END MAIN
}  //  <--END
