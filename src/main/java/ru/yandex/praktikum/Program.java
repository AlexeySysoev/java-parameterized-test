package ru.yandex.praktikum;

public class Program {
    public String typeOfTransport;
    public int horsePower;
    public boolean checkIsAdult(int age){
        if (age >= 18){
            return true;
        }
        return false;
    }

    public int powerRange (String typeOfTransport, int horsePower) {
        if (typeOfTransport == "Truck" && horsePower < 500) {
            return 100;
        } else if (typeOfTransport == "Truck" && horsePower >= 500) {
            return 200;
        } else if (typeOfTransport == "Car" && horsePower < 250) {
            return 10;
        } else if (typeOfTransport == "Car" && horsePower >= 250) {
            return 40;
        } else return 0;
    }
}
