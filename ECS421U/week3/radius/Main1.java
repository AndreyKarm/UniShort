import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();

        System.out.println("What is the radius of your circle? ");
        int radius = scanner.nextInt();
        System.out.println("The value of π is " + utils.PI); // 3.14
        System.out.println("The perimeter of your circle is " + utils.circlePerimeter(radius) + " units");
        System.out.println("The area of your circle is " + utils.circleArea(radius) + " square units");
    }
}