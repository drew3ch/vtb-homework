package lesson5.homework;

public class Human extends Participant implements Runable, Jumpable, Swimmable {

    private final int maxRunVal;
    private final int maxJumpVal;
    private final int maxSwimVal;

    public Human(String name, int maxRunVal, int maxJumpVal, int maxSwimVal) {
        super(name);
        this.maxRunVal = maxRunVal;
        this.maxJumpVal = maxJumpVal;
        this.maxSwimVal = maxSwimVal;
    }

    @Override
    public int getMaxJumpVal() {
        return maxJumpVal;
    }

    @Override
    public int getMaxRunVal() {
        return maxRunVal;
    }

    @Override
    public int getMaxSwimVal() {
        return maxSwimVal;
    }
}