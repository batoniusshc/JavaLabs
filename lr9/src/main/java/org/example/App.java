package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Furniture[] furniture = {
                new Table("Рабочий стол", "Дерево", 250, 4),
                new Table("Кухонный стол", "Дерево", 300, 4),
                new Table("Офисный стол", "Металл", 400, 4),

                new Chair("Стул 1", "Дерево", 100, true),
                new Chair("Стул 2", "Металл", 120, true)
        };

        for (Furniture item : furniture) {
            item.displayInfo();

            System.out.println("Назначение " + item.getPurpose());
            System.out.println("Размеры " + item.getDimensions());

            System.out.println();
        }
    }
}
