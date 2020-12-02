package ru.geekbrains.lesson05.homework;

public class Cat extends Participant implements Runable, Jumpable {

    private final int maxRunVal;
    private final int maxJumpVal;

    public Cat(String name, int maxRunVal, int maxJumpVal) {
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