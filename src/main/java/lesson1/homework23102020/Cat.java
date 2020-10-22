package lesson1.homework23102020;

public class Cat extends Participant implements RunAble, JumpAble {

    public Cat(String name, int maxRunVal, int maxJumpVal) {
        super(name);
        setMaxRunVal(maxRunVal);
        setMaxJumpVal(maxJumpVal);
    }

    @Override
    public void setMaxRunVal(int maxRunVal) {
        this.maxRunVal = maxRunVal;
    }

    @Override
    public void setMaxJumpVal(int maxJumpVal) {
        this.maxJumpVal = maxJumpVal;
    }

}