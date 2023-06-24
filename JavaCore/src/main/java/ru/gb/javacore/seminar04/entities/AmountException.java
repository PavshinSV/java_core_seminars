package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс исключения пробрасываемый при ошибке связанной с полем Количество в сущности Заказ
 */
public class AmountException extends Exception{
    public AmountException(String message){
        super(message);
    }
}