package main.java.ru.gb.javacore.seminar05.views;

public class Console_viewer {
    public void print(int[] field) {

        for (int i = 0; i < 3; i++) {
            System.out.println(getString(field[i * 3], field[i * 3 + 1], field[i * 3 + 2]));
            if (i != 2) {
                System.out.println("-------------");
            }
        }
    }

    private String getString(int a1, int a2, int a3) {
        String str = new String();
        str += "| " + symbol(a1) + " | " + symbol(a2) + " | " + symbol(a3) + " |";
        return str;
    }

    private String symbol(int a) {
        String result = new String();
        switch (a) {
            case (1):
                result = "X";
                break;
            case (2):
                result = "0";
                break;
            case (3):
                result = " ";
                break;
        }
        return result;
    }
}
