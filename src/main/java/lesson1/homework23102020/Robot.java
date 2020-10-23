package lesson1.homework23102020;

public class Robot extends Participant implements Runable, Jumpable {

    private final int maxRunVal;
    private final int maxJumpVal;

    public Robot(String name, int maxRunVal, int maxJumpVal) {
        super(name);
        this.maxRunVal = maxRunVal;
        this.maxJumpVal = maxJumpVal;
    }

    @Override
    public int getMaxRunVal() {
        return maxRunVal;
    }

    @Override
    public int getMaxJumpVal() {
        return maxJumpVal;
    }
}