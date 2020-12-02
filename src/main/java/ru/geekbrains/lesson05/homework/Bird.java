package ru.geekbrains.lesson05.homework;

public class Bird extends Participant implements Jumpable, Flyable {

    private final int maxJumpVal;
    private final int maxFlyVal;

    public Bird(String name, int maxJumpVal, int maxFlyVal) {
        super(name);
        this.maxJumpVal = maxJumpVal;
        this.maxFlyVal = maxFlyVal;
    }

    @Override
    public int getMaxJumpVal() {
        return maxJumpVal;
    }

    @Override
    public int getMaxFlyVal() {
        return maxFlyVal;
    }
}