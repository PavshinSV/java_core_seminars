package main.java.ru.gb.javacore.seminar05;

import main.java.ru.gb.javacore.seminar05.controllers.File_controller;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File_controller file_controller = new File_controller();
        try {
            file_controller.filesBackup();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
