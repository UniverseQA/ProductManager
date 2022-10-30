package ru.netology.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.book.Book;
import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;
import ru.netology.smartphone.Smartphone;

public class ProductManagerTest {

    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Product nokia = new Smartphone(1, "Nokia 3110", 1500, "Nokia");
    Product iphone = new Product(22, "Iphone 4s ", 15000);
    Product sony = new Book(7, "Соня Мармеладова", 700, "Ф.М. Достоевский");

    @BeforeEach
    public void setup() {
        manager.add(nokia);
        manager.add(iphone);
        manager.add(sony);
    }

    @Test

    public void shouldSearchIphone() {
        String text = "Iphone 4s";

        Product[] expected = {iphone};
        Product[] actual = manager.searchBy("Iphone 4s");

        Assertions.assertArrayEquals(expected, actual);
    }
}
