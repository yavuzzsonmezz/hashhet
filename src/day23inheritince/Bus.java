package day23inheritince;

public class Bus extends Motorized {

    public Bus (int numOfPassengers) {
        super(16);
        System.out.println("Bus constructor with integer parameter");
    }
}