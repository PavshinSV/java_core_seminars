package ru.gb.javacore.seminar01;


import ru.gb.javacore.seminar01.Entitis.Toy;
import ru.gb.javacore.seminar01.View.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Robot", "Doll", "Vehicle"};
        int[] numbers = {1, 3, 9};
        List<Toy> toys = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            toys.add(new Toy(names[i],numbers[i]));
        }

        for (Toy element : toys){
            Decorator.print(element.toString());
        }
    }
}