package ru.geekbrains.lesson08.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class phoneBook {

    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastname, String phone) {
        if (phoneBook.containsKey(lastname)) {
            List<String> phones = phoneBook.get(lastname);
            if (!phones.contains(phone)) phones.add(phone);
        } else {
            phoneBook.put(lastname, new ArrayList<>(Arrays.asList(phone)));
        }
    }

    public List<String> get(String lastname) {
        if (phoneBook.containsKey(lastname)) {
            return phoneBook.get(lastname);
        } else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        phoneBook phoneBook = new phoneBook();

        phoneBook.add("Lastname1", "11111111");
        phoneBook.add("Lastname1", "22222222");
        phoneBook.add("Lastname2", "33333333");

        System.out.println("Lastname1 phones: " + phoneBook.get("Lastname1"));
        System.out.println("Lastname2 phones: " + phoneBook.get("Lastname2"));
        System.out.println("Lastname3 phones: " + phoneBook.get("Lastname3"));

    }
}