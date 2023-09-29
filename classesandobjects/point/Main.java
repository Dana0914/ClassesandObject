package classesandobjects.point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 7.0);
        Point p2 = new Point(2.0, 5.0);
        double x1 = p1.getX();
        double x2 = p2.getX();
        double y1 = p1.getY();
        double y2 = p2.getY();
        System.out.println("The point p1 position: " + x1 + " , " + x2);
        System.out.println("The point p2 position: " + y1 + " , " + y2);
        System.out.println("The distance between p1 and p2: " + p1.getDistance(p2));
        System.out.println("The point p1 lies on the line: " + p1.isOnLine(2, 5));
        System.out.println("The point p2 lies on the line: " + p2.isOnLine(2, 5));
    }
}
