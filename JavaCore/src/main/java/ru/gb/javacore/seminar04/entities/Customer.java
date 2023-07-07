package main.java.ru.gb.javacore.seminar04.entities;

/**
 * Класс Покупатель, содержит сведения о Фамилии, Имени, Отчестве, возрасте и номере телефона конкретного покупателя
 */
public class Customer {
    private String patronymic;
    private String name;
    private String surname;
    private short age;
    private String phoneNumber;
    private Gender gender;

    public Customer(String patronymic, String name, String surname, Gender gender, short age, String phoneNumber) {
        this.patronymic = patronymic;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender=gender;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "patronymic = " + patronymic +
                ", name = " + name +
                ", surname = " + surname +
                ", gender = " + gender +
                ", age= " + age +
                ", phoneNumber = " + phoneNumber +
                '}';
    }
}