package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final InventoryService inventoryService;

    public OrderService(@Qualifier("alternativeInventoryService") InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void createOrder(int productId) {
        if (inventoryService.checkProduct(productId)) {
            System.out.println("Order created for product ID: " + productId);
        } else {
            System.out.println("Product ID " + productId + " is out of stock.");
        }
    }
}
