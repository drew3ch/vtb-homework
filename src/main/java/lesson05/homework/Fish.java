package lesson05.homework;

public class Fish extends Participant implements Swimmable {

    private final int maxSwimVal;

    public Fish(String name, int maxSwimVal) {
        super(name);
        this.maxSwimVal = maxSwimVal;
    }

    @Override
    public int getMaxSwimVal() {
        return maxSwimVal;
    }
}
