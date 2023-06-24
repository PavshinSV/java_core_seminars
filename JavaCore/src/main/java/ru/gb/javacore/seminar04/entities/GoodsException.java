package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс исключения пробрасываемый при ошибке связанной с сущностью Товар
 */
public class GoodsException extends Exception{
    public GoodsException(String message){
        super(message);
    }
}