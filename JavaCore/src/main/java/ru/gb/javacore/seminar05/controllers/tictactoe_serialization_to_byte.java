package main.java.ru.gb.javacore.seminar05.controllers;

import java.io.FileOutputStream;
import java.nio.file.Path;

public class tictactoe_serialization_to_byte {
    public static void toFile(Path path, int[] array) throws Exception {
        if (array.length!=9){
            throw new Exception("Wrong size of array. Size must be 9");
        }
        byte[] bytes = new byte[3];
        for (int i = 0; i<3;i++){
            bytes[i] = getByte(array[i],array[i+1],array[i+2]);
        }
        try (FileOutputStream fos = new FileOutputStream(path.toAbsolutePath().toString())){
            fos.write(bytes);
        } catch (Exception e){
            throw new Exception(e);
        }
    }

    private static byte getByte(int a1, int a2, int a3){
        return (byte) (a1*2 + a2*8 + a3*32);
    }
}