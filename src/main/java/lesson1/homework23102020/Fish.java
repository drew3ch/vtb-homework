package lesson1.homework23102020;

public class Fish extends Participant implements SwimAble {

    public Fish(String name, int maxSwimVal) {
        super(name);
        setMaxSwimVal(maxSwimVal);
    }

    @Override
    public void setMaxSwimVal(int maxSwimVal) {
        this.maxSwimVal = maxSwimVal;
    }
}
