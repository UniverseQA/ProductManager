package ru.netology.managers;

import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.save(product);
    }

    public boolean matches(Product product, String search) {
        if (product.getProductName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        Product[] tmp = new Product[result.length + 1];
        int copyToIndex = 0;
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        result = tmp;
        return result;
    }
}
