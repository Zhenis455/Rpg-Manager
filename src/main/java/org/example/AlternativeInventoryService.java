package org.example;

import org.springframework.stereotype.Service;

@Service
public class AlternativeInventoryService implements InventoryService {
    private final ProductRepository repository;

    public AlternativeInventoryService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(int id, String name) {
        repository.addProduct(id, "Alt-" + name);
        System.out.println("Alternative Added: " + name);
    }

    public void removeProduct(int id) {
        repository.removeProduct(id);
        System.out.println("Alternative Removed product ID: " + id);
    }

    public boolean checkProduct(int id) {
        return repository.hasProduct(id);
    }
}
