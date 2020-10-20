package lesson1.homework21102020;

public class Treadmill {

    private String name;
    private int meters;

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

    public void setMeters(int meters) {
        this.meters = meters;
    }
}
