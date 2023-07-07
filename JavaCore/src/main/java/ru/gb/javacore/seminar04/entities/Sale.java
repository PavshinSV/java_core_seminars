package main.java.ru.gb.javacore.seminar04.entities;

public enum Sale {
    ZERO((short)0), FIVE((short)5), TEN((short)10), FIFTEEN((short)15), TWENTY((short)20);
    short value;
    Sale(short value){
        this.value=value;
    }

    public short getValue() {
        return value;
    }
}
