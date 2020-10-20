package lesson1.homework21102020;

public class Wall {

    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
