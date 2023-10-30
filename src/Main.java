package com.myproject;

// Клас Машина
class Car {
    // Поля класу
    private int year;
    private String color;

    // Конструктор за замовчуванням
    public Car() {
        year = 0;
        color = "Сірий";
    }

    // Конструктор з одним параметром (рік)
    public Car(int year) {
        this.year = year;
        color = "Сірий";
    }

    // Конструктор з двома параметрами (рік і колір)
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    // Метод для отримання року
    public int getYear() {
        return year;
    }

    // Метод для отримання кольору
    public String getColor() {
        return color;
    }
}

// Клас Main для тестування
public class Main {
    public static void main(String[] args) {
        // Створення екземплярів класу Car, викликаючи різні конструктори
        Car car1 = new Car(); // Конструктор за замовчуванням
        Car car2 = new Car(2022); // Конструктор з одним параметром (рік)
        Car car3 = new Car(2020, "Червоний"); // Конструктор з двома параметрами (рік і колір)

        // Виведення інформації про машини
        System.out.println("Машина 1: Рік " + car1.getYear() + ", Колір " + car1.getColor());
        System.out.println("Машина 2: Рік " + car2.getYear() + ", Колір " + car2.getColor());
        System.out.println("Машина 3: Рік " + car3.getYear() + ", Колір " + car3.getColor());
    }
}
