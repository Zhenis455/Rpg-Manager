package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultInventoryService implements InventoryService {
    private final ProductRepository repository;

    public DefaultInventoryService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(int id, String name) {
        repository.addProduct(id, name);
        System.out.println("Added: " + name);
    }

    public void removeProduct(int id) {
        repository.removeProduct(id);
        System.out.println("Removed product ID: " + id);
    }

    public boolean checkProduct(int id) {
        return repository.hasProduct(id);
    }
}

