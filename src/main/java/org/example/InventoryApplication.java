package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InventoryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        InventoryService inventoryService = context.getBean(InventoryService.class);
        inventoryService.addProduct(1, "Laptop");

        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder(1);
        orderService.createOrder(2);

        context.getBean(AppConfig.LazySingleton.class);
        context.close();
    }
}

