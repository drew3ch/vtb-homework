package lesson4.homework;

public class Treadmill {

    private String name;
    private final int meters;

    public Treadmill(String name, int meters) {
        this.name = name;
        this.meters = meters;
    }

    public String getName() {
        return name;
    }

    public int getMeters() {
        return meters;
    }

}
