package main.java.ru.gb.javacore.seminar04.entities;

import main.java.ru.gb.javacore.seminar04.Main;

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

    public static Order makePurchase(Customer customer, Goods goods, short amount) throws CustomerExceptions, GoodsException, AmountException {

        if (customer == null){
            throw new CustomerExceptions("Пользователь не инициализирован");
        }
        if (!Main.customers.contains(customer)){
            throw new CustomerExceptions("Пользователь отсутствует в списке");
        }

        if (goods == null){
            throw new GoodsException("Товар не инициализирован");
        }
        if (!Main.goodsList.contains(goods)){
            throw new GoodsException("Товар отсутствует в списке");
        }


        if (amount<1 || amount>100){
            throw new AmountException("Неверно указано количество товара");
        }
        return new Order(customer, goods, amount);
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
                "order id=" + oid +
                ", customer=" + customer +
                ", goods=" + goods +
                ", amount=" + amount +
                '}';
    }
}