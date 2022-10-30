package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.Product;

public class ProductRepositoryTest {

    Product nokia = new Product(1, "Nokia 3110", 1500);
    Product iphone = new Product(22, "Iphone 4s ", 15000);
    Product sony = new Product(7, "sony xperia z", 7000);

    @Test

            public void shouldWork() {
        ProductRepository repository = new ProductRepository();
        repository.save(nokia);
        repository.save(iphone);
        repository.save(sony);
        repository.removeById(iphone.getId());

        Product[] expected = {nokia, sony};
        Product[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
