package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс описывающий карточку товара. Содержит наименование товара и стоимость
 */
public class Goods {
    private String title;
    private int cost;

    public Goods(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "title = " + title +
                ", cost = " + cost +
                '}';
    }
}
