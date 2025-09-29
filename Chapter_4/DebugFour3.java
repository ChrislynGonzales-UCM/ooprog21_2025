import java.util.Scanner;


interface Box {
void showData();
double getVolume();
}


class DebugBox implements Box {
private int width;
private int length;
private int height;


public DebugBox() {
    width = 1;
    length = 1;
    height = 1;
}


public DebugBox(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
}

@Override
public void showData() {
    System.out.println(" Width: " + width);
    System.out.println(" Length: " + length);
    System.out.println(" Height: " + height);
}

@Override
public double getVolume() {
    return width * length * height;
}


}

public class DebugFour3 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);


    System.out.print("Enter width of box >> ");
    int w = input.nextInt();

    System.out.print("Enter length of box >> ");
    int l = input.nextInt();

    System.out.print("Enter height of box >> ");
    int h = input.nextInt();

    Box box1 = new DebugBox();           
    Box box2 = new DebugBox(w, l, h);    

    System.out.println("The dimensions of the first box are");
    box1.showData();
    System.out.print(" The volume of the first box is ");
    showVolume(box1);

    System.out.println("The dimensions of the second box are");
    box2.showData();
    System.out.print(" The volume of the second box is ");
    showVolume(box2);
}

public static void showVolume(Box aBox) {
    double vol = aBox.getVolume();
    System.out.println(vol);
}


}
