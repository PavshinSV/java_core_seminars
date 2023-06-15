package main.java.ru.gb.javacore.seminar02.variant1;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {6,1,0,7,2,8,5};
        int[] array2 = {7,2,8,5,15,-1,22,-24,0,0,12};
        Decorator.print(ArrayMethods.countEvens(array1));
        Decorator.print(ArrayMethods.countEvens(array2));
        Decorator.print(ArrayMethods.extremumDiff(array1));
        Decorator.print(ArrayMethods.extremumDiff(array2));
        Decorator.print(ArrayMethods.dubleZero(array1));
        Decorator.print(ArrayMethods.dubleZero(array2));
    }
}