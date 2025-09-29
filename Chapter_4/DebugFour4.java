import java.util.Scanner;


interface Trip {
String getDestination();
String getDepartureCity();
String getMode();
}


class DebugTrip implements Trip {
private String destination;
private String departure;
private String mode;


private static final String DEFAULT_CITY = "Atlanta";
private static final String DEFAULT_MODE = "car";


public DebugTrip(String destination) {
    this(destination, DEFAULT_CITY, DEFAULT_MODE);
}


public DebugTrip(String destination, String departure) {
    this(destination, departure, DEFAULT_MODE);
}


public DebugTrip(String destination, String departure, String mode) {
    this.destination = destination;
    this.departure = departure;
    this.mode = mode;
}

@Override
public String getDestination() {
    return destination;
}

@Override
public String getDepartureCity() {
    return departure;
}

@Override
public String getMode() {
    return mode;
}


}

public class DebugFour4 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);


    System.out.print("Enter destination city >> ");
    String destinationCity = input.nextLine();

    System.out.print("Enter departure city >> ");
    String departureCity = input.nextLine();

    System.out.print("Enter mode of transportation >> ");
    String mode = input.nextLine();

    Trip trip1 = new DebugTrip(destinationCity);
}

}
