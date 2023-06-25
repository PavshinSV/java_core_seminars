package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс описывающий карточку товара. Содержит наименование товара и стоимость
 */
public class Goods {
    private String title;
    private int cost;
    Sale sale;
    Classes classesOfGoods;

    public Goods(String title, int cost) {
        this.title = title;
        this.cost = cost;
        this.sale = Sale.ZERO;
        this.classesOfGoods = Classes.STANDARD;
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

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Classes getClassesOfGoods() {
        return classesOfGoods;
    }

    public void setClassesOfGoods(Classes classesOfGoods) {
        this.classesOfGoods = classesOfGoods;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", sale=" + sale +
                ", classes of goods=" + classesOfGoods +
                '}';
    }
}
