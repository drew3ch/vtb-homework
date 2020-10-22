package lesson1.homework23102020;

public abstract class Participant {

    private final String name;
    protected int maxJumpVal = 0;
    protected int maxFlyVal = 0;
    protected int maxRunVal = 0;
    protected int maxSwimVal = 0;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxJumpVal() {
        return maxJumpVal;
    }

    public int getMaxFlyVal() {
        return maxFlyVal;
    }

    public int getMaxRunVal() {
        return maxRunVal;
    }

    public int getMaxSwimVal() {
        return maxSwimVal;
    }

}