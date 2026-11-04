package org.example;

/**
 * Hello world!
 */
public class App {
    public static Shoe findShoe(Shoe[] shoes, String brand)
            throws ShoeNotFoundException {

        for (Shoe shoe : shoes) {
            if (shoe.getBrand().equals(brand)) {
                return shoe;
            }
        }

        throw new ShoeNotFoundException(
                "Обувь бренда " + brand + " не найдена"
        );
    }
    public static void main(String[] args) {
        try {
            Shoe shoe1 = new Shoe(
                    "Nike", 38, "Черный", 300, 10
            );

            Shoe shoe2 = new Shoe(
                    "Adidas", 40, "Белый", 250, 5
            );

            Shoe shoe3 = new Shoe(
                    "Puma", 39, "Красный", 200, 8
            );

            Shoe[] shoes = {
                    shoe1, shoe2, shoe3
            };

            System.out.println("До продажи");
            shoe1.displayInfo();

            System.out.println();

            try {
                shoe1.sell(3);
            } catch (StockException e) {
                System.out.println(
                        "Ошибка продажи " + e.getMessage()
                );
            }

            System.out.println();

            System.out.println("После продажи ");
            shoe1.displayInfo();

            System.out.println();

            try {
                shoe1.restock(5);
            } catch (StockException e) {
                System.out.println(
                        "Ошибка пополнения  " + e.getMessage()
                );
            }

            System.out.println();

            System.out.println("После пополнения ");
            shoe1.displayInfo();

            System.out.println();

            try {
                Shoe found = findShoe(shoes, "Adidas");

                System.out.println("Обувь найдена ");
                found.displayInfo();

            } catch (ShoeNotFoundException e) {
                System.out.println(e.getMessage());
            }

        } catch (InvalidShoeDataException e) {
            System.out.println(
                    "Ошибка создания обуви " + e.getMessage()
            );

        } finally {
            System.out.println();
            System.out.println("Работа магазина завершена");
        }
    }
}
