package ru.netology.book;

import ru.netology.product.Product;

public class Book extends Product {
    private String writer;

    public Book (int id, String productName, int price, String writer) {
        super(id, productName, price);
        this.writer = writer;
    }
}
