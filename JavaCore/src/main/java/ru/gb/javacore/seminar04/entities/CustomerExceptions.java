package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс исключения пробрасываемый при ошибке связанной с сущностью Покупатель
 */
public class CustomerExceptions extends Exception {
    public CustomerExceptions(String message){
        super(message);
    }
}