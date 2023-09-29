package classesandobjects.circle;

public class Main {
    public static void main(String[] args) {
        Points p1 = new Points(4.0, 3.0);
        Circle c1 = new Circle(2.0, p1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.getArea() + c1.getCircumference());
    }
}
