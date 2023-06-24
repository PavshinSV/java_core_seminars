package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс описывающий карточку заказа. Содержит ссылку на покупателя, на товар и на количество товара
 */
public class Order {
    private int oid;
    private Customer customer;
    private Goods goods;
    private short amount;
    private static int count;

    public Order(Customer customer, Goods goods, short amount) {
        this.oid = ++count;
        this.customer = customer;
        this.goods = goods;
        this.amount = amount;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order id = " + oid +
                ", customer = " + customer +
                ", goods = " + goods +
                ", amount = " + amount +
                '}';
    }
}