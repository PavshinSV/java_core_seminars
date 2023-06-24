package main.java.ru.gb.javacore.seminar04;

import main.java.ru.gb.javacore.seminar04.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Customer> customers = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static List<Goods> goodsList = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Pavshin", "Sergei", "Valentinovich", (short) 43, "+7-953-588-79-36"));
        customers.add(new Customer("Pavshina", "Natalia", "Fedorovna", (short) 45, "+7-902-920-51-56"));
        goodsList.add(new Goods("Огурец", 140));
        goodsList.add(new Goods("Апельсин", 280));
        goodsList.add(new Goods("Помидор", 400));
        goodsList.add(new Goods("Картофель", 80));
        goodsList.add(new Goods("Морковь", 350));

        purchase(customers.get(0), goodsList.get(0), (short) 12);
        purchase(customers.get(1), goodsList.get(2), (short) 5);
        //purchase(new Customer("Pavshin", "Egor", "Sergeevich", (short) 10, "Green"), goodsList.get(1), (short) 1);
        purchase(customers.get(1), new Goods("Авокадо", (short)500), (short) 5);
        purchase(customers.get(1), goodsList.get(2), (short) 500);
        purchase(customers.get(0), goodsList.get(3), (short) 20);
        purchase(customers.get(1), goodsList.get(4), (short) 3);

        for (Order order : orders) {
            System.out.println(order);
        }
    }


    public static void purchase(Customer customer, Goods goods, short amount) {
        try {
            orders.add(Order.makePurchase(customer, goods, amount));
        } catch (CustomerExceptions e) {
            throw new RuntimeException(e + " " + customer);
        } catch (GoodsException e) {
            System.out.println(e + " " + goods);
        } catch (AmountException e) {
            purchase(customer, goods, (short) 1);
        }
    }
}