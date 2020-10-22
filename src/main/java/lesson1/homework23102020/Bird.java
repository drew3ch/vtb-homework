package lesson1.homework23102020;

public class Bird extends Participant implements JumpAble, FlyAble {

    public Bird(String name, int maxJumpVal, int maxFlyVal) {
        super(name);
        setMaxJumpVal(maxJumpVal);
        setMaxFlyVal(maxFlyVal);
    }

    @Override
    public void setMaxJumpVal(int maxJumpVal) {
        this.maxJumpVal = maxJumpVal;
    }

    @Override
    public void setMaxFlyVal(int maxFlyVal) {
        this.maxFlyVal = maxFlyVal;
    }
}