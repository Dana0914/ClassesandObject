package classesandobjects.circle;

public class Circle {
    private double radius;
    private Points center;
    public Circle(double radius, Points center) {
        this.radius = radius;
        this.center = center;
    }
    public double getArea() {
         return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
