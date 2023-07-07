package main.java.ru.gb.javacore.seminar05;

import main.java.ru.gb.javacore.seminar05.controllers.File_controller;
import main.java.ru.gb.javacore.seminar05.controllers.tictactoe_serialization_to_byte;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Блок выполнения первого задание
//        File_controller file_controller = new File_controller();
//        try {
//            file_controller.filesBackup();
//        } catch (IOException e) {
//            System.out.println(e);
//        }

//        Блок выполнения второго задания
        Path path = Paths.get(".//tictactoe.txt");
        int[] array = new int[]{3,3,3,3,2,3,3,3,3};
        try {
            tictactoe_serialization_to_byte.toFile(path,array);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
