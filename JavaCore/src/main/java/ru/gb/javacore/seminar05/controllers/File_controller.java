package main.java.ru.gb.javacore.seminar05.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File_controller {
    public boolean filesBackup() throws IOException {
        Path root = Paths.get(".//").toAbsolutePath().normalize();
        Path backup = root.resolve("backup");
        List<Path> files = new ArrayList<>();
        Files.walk(root,1).forEach(e -> files.add(e));
        for (Path s: files){
            if (!Files.isDirectory(s)){
                if (!Files.exists(backup)){
                    Files.createDirectories(backup);
                }
                Files.copy(s,backup.resolve(s.getFileName()));
            }
            System.out.println(s);
        }
        return true;
    }
}