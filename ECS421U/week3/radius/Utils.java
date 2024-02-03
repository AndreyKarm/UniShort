public class Utils {
    final double PI = 3.14;

    public double circlePerimeter(double radius) {
        double perimeter = 2 * PI * radius;
        perimeter = Math.floor(perimeter * 10) / 10; // round down to 1 decimal place
        return perimeter;
    }

    public double circleArea(double radius) {
        double area = PI * radius * radius;
        area = Math.floor(area * 10) / 10; // round down to 1 decimal place
        return area;
    }
}