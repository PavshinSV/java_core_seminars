package main.java.ru.gb.javacore.seminar01;

import java.util.ArrayList;
import java.util.List;

import main.java.ru.gb.javacore.seminar01.Entitis.Toy;
import main.java.ru.gb.javacore.seminar01.View.Decorator;

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