package lesson5.homework;

public abstract class Participant {

    private final String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}