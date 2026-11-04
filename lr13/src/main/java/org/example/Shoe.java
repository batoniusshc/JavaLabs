package org.example;

public class Shoe {
    private String brand;
    private int size;
    private String color;
    private double price;
    private int stock;

    public String getBrand(){return brand;}
    public int getSize(){return size;}
    public String getColor(){return color;}
    public double getPrice(){return price;}
    public int getStock(){return stock;}

    public Shoe(String brand, int size, String color,
                double price, int stock) throws InvalidShoeDataException {
        this.brand = brand;
        setSize(size);
        this.color = color;
        setPrice(price);
        this.stock = stock;
    }
    public void setBrand(String b) {
        brand = b;
    }
    public void setSize(int s) throws InvalidShoeDataException {
        if (s < 20 || s > 50) {
            throw new InvalidShoeDataException("Размер должен быть от 20 до 50");
        }
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }

    public void setPrice(double p) throws InvalidShoeDataException {
        if (p <= 0) {
            throw new InvalidShoeDataException("Цена должна быть больше 0");
        }
        price = p;
    }
    public void setStock(int s) {
        stock = s;
    }

    public void sell(int quantity) throws StockException {

        if (quantity <= 0) {
            throw new StockException(
                    "Количество для продажи должно быть больше 0"
            );
        }

        if (quantity > stock) {
            throw new StockException(
                    "Недостаточно обуви на складе"
            );
        }

        stock -= quantity;

        System.out.println(
                "Продано " + quantity + " пар обуви"
        );
    }

    public void restock(int quantity) throws StockException {

        if (quantity <= 0) {
            throw new StockException(
                    "Количество для пополнения должно быть больше 0"
            );
        }

        stock += quantity;

        System.out.println(
                "На склад добавлено " + quantity + " пар обуви"
        );
    }

    public void displayInfo() {
        System.out.println("Бренд " + brand);
        System.out.println("Размер " + size);
        System.out.println("Цвет " + color);
        System.out.println("Цена " + price);
        System.out.println("На складе " + stock);
    }

}
