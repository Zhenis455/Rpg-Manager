package org.example;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<Integer, String> products = new HashMap<>();

    public void addProduct(int id, String name) {
        products.put(id, name);
    }

    public void removeProduct(int id) {
        products.remove(id);
    }

    public boolean hasProduct(int id) {
        return products.containsKey(id);
    }

    public String getProduct(int id) {
        return products.get(id);
    }
}