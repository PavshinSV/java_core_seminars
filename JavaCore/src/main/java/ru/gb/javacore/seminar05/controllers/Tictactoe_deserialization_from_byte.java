package main.java.ru.gb.javacore.seminar05.controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class Tictactoe_deserialization_from_byte {
    public static int[] fromFile(Path path) {
        byte[] bytes = new byte[3];
        int[] field = new int[9];
        try (FileInputStream fis = new FileInputStream(path.toAbsolutePath().toString())) {
            for (int i = 0; i < 3; i++) {
                bytes[i] = (byte) fis.read();
                System.out.println(bytes[i]);
                int[] chunk = deserializator(bytes[i]);
                for (int j = 0; j < chunk.length; j++) {
                    field[i * 3 + j] = chunk[j];
                }
            }
            return field;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] deserializator(byte b) {
        int[] part = new int[3];
        int count = 0;
        for (int i = 5; i > 0; i = i - 2) {
            int shift = 2 << i - 1;
            if (b >= (3 * shift)) {
                part[2-count] = 3;
                b = (byte) (b - 3 * shift);
            }
            if (b >= (2 * shift)) {
                part[2-count] = 2;
                b = (byte) (b - 2 * shift);
            }
            if (b >= shift) {
                part[2-count] = 1;
                b = (byte) (b-shift);
            }
            count++;
        }
        return part;
    }
}
