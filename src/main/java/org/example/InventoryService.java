package org.example;

public interface InventoryService {
    void addProduct(int id, String name);
    void removeProduct(int id);
    boolean checkProduct(int id);
}

