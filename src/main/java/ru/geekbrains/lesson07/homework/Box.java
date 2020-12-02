package ru.geekbrains.lesson07.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {

        if (fruits.size() == 0) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }

    }

    public boolean compare(Box<?> box) {

        return this.getWeight() == box.getWeight();

    }

    public void transfer(Box<T> box) {

        box.fruits.addAll(this.fruits);
        fruits.clear();

    }

}