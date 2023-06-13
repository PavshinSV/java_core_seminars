package ru.gb.javacore.seminar01.Entitis;

public class Toy {
    int id;
    String name;
    int count;
    int number;

    public Toy(String name, int count) {
        this.name = name;
        this.count = count;
        this.id = getId();
    }

    private int getId(){
        return ++number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}