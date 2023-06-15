package main.java.ru.gb.javacore.seminar01.Entitis;

/**
 * Class of Toy
 */
public class Toy {
    int id;
    String name;
    int count;
    static int number;

    /**
     * Constructor
     * @param name - name of Toy
     * @param count - numbers of instance on stock
     */
    public Toy(String name, int count) {
        this.name = name;
        this.count = count;
        this.id = getId();
    }

    /**
     *
     * @return - returned Id of a Toy
     */
    private int getId(){
        return ++number;
    }

    /**
     *
     * @param id - set id for a Toy
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return - reterned name of a Toy
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - set name for a Toy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return returned numbers of Toy on store
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @param count - set numbers of a Toy on store
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     *
     * @return - to get a string view of current Toy
     */
    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}