package main.java.ru.gb.javacore.seminar02.variant1;

/**
 * Класс содержащий методы исследования массивов в соответствии с ДЗ
 * @author - Pavshin Sergei
 */
public class ArrayMethods {

    /**
     * Метод возвращающий количество четных значений в принимаемом массиве
     * @param array - принимаемый на исследование массив
     * @return - количество четных элементов (включая 0)
     */
    public static int countEvens(int[] array){
        int length = array.length;
        int result = 0;
        for (int i = 0; i<length; i++){
            if (array[i]%2==0){
                result++;
            }
        }
        return result;
    }

    /**
     * Метод возвращает разность между min и max элементами принятого массива
     * @param array - входящий массив
     * @return - возвращаемое значение, разность между min и max элементами принятого массива
     */
    public static int extremumDiff(int[] array){
        int length = array.length;
        int min = array[0];
        int max = array[0];
        for (int i =1; i<length; i++){
            if (min>array[i]){
                min = array[i];
            }
            if (max<array[i]){
                max = array[i];
            }
        }
        return max-min;
    }

    /**
     * Метод возвращает минимальное значение в массиве
     * @param array - исследуемый массив
     * @return - минимальное значение
     */
    public static int minElement(int[] array){
        int length = array.length;
        int result = array[0];
        for (int i=1; i<length; i++){
            if (result>array[i]){
                result = array[i];
            }
        }
        return result;
    }

    /**
     * Метод возвращает максимальное значение принятого массива
     * @param array - принимаемый на исследование массив
     * @return - возвращаемое значение
     */
    public static int maxElement(int[] array){
        int length = array.length;
        int result = array[0];
        for (int i=1; i<length; i++){
            if (result<array[i]){
                result = array[i];
            }
        }
        return result;
    }


    /**
     * Метод возвращающий true в случае если в принятом на исследование массиве есть два соседних элемента равных 0
     * @param array - принимаемый на исследование массив
     * @return - результат исследования
     */
    public static boolean dubleZero(int[] array){
        int length = array.length;
        int previous = array[0];
        for (int i=1; i<length; i++){
            if(previous==0 && array[i]==0){
                return true;
            }
            previous=array[i];
        }
        return false;
    }
}