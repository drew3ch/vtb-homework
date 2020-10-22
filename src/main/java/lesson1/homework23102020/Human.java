package lesson1.homework23102020;

public class Human extends Participant implements RunAble, JumpAble, SwimAble {

    public Human(String name, int maxRunVal, int maxJumpVal, int maxSwimVal) {
        super(name);
        setMaxRunVal(maxRunVal);
        setMaxJumpVal(maxJumpVal);
        setMaxSwimVal(maxSwimVal);
    }

    @Override
    public void setMaxJumpVal(int maxJumpVal) {
        this.maxJumpVal = maxSwimVal;
    }

    @Override
    public void setMaxRunVal(int maxRunVal) {
        this.maxRunVal = maxRunVal;
    }

    @Override
    public void setMaxSwimVal(int maxSwimVal) {
        this.maxSwimVal = maxSwimVal;
    }
}