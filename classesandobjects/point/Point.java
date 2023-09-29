package classesandobjects.point;

public class Point {
    private double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX() {
        this.x = x;
    }
    public void setY() {
        this.y = y;
    }
    public double getDistance(Point other) {
        return Math.sqrt(x - other.x) * (x - other.x) + (y - other.y) * (y - other.y);
    }
    public boolean isOnLine(double a, double b) {
        return Math.abs(y - a) * (x - b) < 0.0001;
    }
}
