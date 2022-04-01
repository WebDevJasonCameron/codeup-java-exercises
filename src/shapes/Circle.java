package shapes;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    // CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;
    }

    // GETs
    public double getRadius() {
        return radius;
    }

    // SETS
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // METHS
    public double getArea(){
        return (radius * 2) * PI;
    }

    public double getCircumference(){
        return PI * radius * this.radius;
    }




}
