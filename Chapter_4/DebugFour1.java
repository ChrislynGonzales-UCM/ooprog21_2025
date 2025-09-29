import java.util.Scanner;


class DebugCircle {
private double radius;


public DebugCircle(double radius) {
    this.radius = radius;
}

public double getRad() {
    return radius;
}

public double getDiam() {
    return 2 * radius;
}

public double getArea() {
    return Math.PI * radius * radius;
}


}

public class DebugFour1 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);


    System.out.print("Enter a radius for a circle >> ");
    double radius = input.nextDouble();

    DebugCircle c = new DebugCircle(radius);

    System.out.println("The radius is " + c.getRad());
    System.out.println("The diameter is " + c.getDiam());
    System.out.println("The area is " + c.getArea());
}


}
