package main.java.ru.gb.javacore.seminar05;

import main.java.ru.gb.javacore.seminar05.controllers.File_controller;
import main.java.ru.gb.javacore.seminar05.controllers.Tictactoe_deserialization_from_byte;
import main.java.ru.gb.javacore.seminar05.controllers.Tictactoe_serialization_to_byte;
import main.java.ru.gb.javacore.seminar05.views.Console_viewer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Блок выполнения первого задание
        File_controller file_controller = new File_controller();
        try {
            file_controller.filesBackup();
        } catch (IOException e) {
            System.out.println(e);
        }

//        Блок выполнения второго задания
        Path path = Paths.get(".//tictactoe.txt");
        int[] array = new int[]{3,2,3,2,1,2,3,2,3};
        try {
            Tictactoe_serialization_to_byte.toFile(path,array);
        } catch (Exception e) {
            System.out.println(e);
        }

        int[] field = Tictactoe_deserialization_from_byte.fromFile(path);
        for (int i: field){
            System.out.print(i+" ");
        }
        System.out.println();

        Console_viewer viewer = new Console_viewer();
        viewer.print(field);


    }
}
