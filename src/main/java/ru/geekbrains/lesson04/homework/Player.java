package ru.geekbrains.lesson04.homework;

public class Player {

    private String name;
    private int run;
    private int jump;
    private Treadmill[] treadmills;
    private Wall[] walls;

    public Player(String name, int run, int jump, Treadmill[] treadmills, Wall[] walls) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.treadmills = treadmills;
        this.walls = walls;
    }

    public Treadmill[] getTreadmills() {
        return treadmills;
    }

    public void setTreadmills(Treadmill[] treadmills) {
        this.treadmills = treadmills;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

}