import java.util.Scanner;


class DebugPen {
private String color;
private String point;



public DebugPen() {
    this.color = "blue";    
    this.point = "medium";   
}


public DebugPen(String color, String point) {
    this.color = color;
    this.point = point;
}

public String getColor() {
    return color;
}

public String getPoint() {
    return point;
}


}

public class DebugFour2 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);


    System.out.print("Enter a color ink for the pen >> ");
    String color = input.nextLine();

    System.out.print("Enter a point size - fine, medium, or thick >> ");
    String point = input.nextLine();

    DebugPen pen1 = new DebugPen();                
    DebugPen pen2 = new DebugPen(color, point);    

    System.out.println("Default value pen:");
    display(pen1);

    System.out.println("User value pen:");
    display(pen2);
}

public static void display(DebugPen p) {
    System.out.println(" The pen has ink color " + p.getColor());
    System.out.println(" and a " + p.getPoint() + " point.");
}


}
