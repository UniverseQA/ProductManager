package ru.netology.smartphone;

import ru.netology.product.Product;

public class Smartphone extends Product {
    private String brand;

    public Smartphone (int id, String productName, int price, String brand) {
        super(id, productName, price);
        this.brand = brand; }
    }
