package org.example;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;
public class InventoryIntegrationTest {
 @Test void inventoryServiceUsesPrimaryAndSharesRepository() {
  try(var context=new AnnotationConfigApplicationContext(AppConfig.class)){
   InventoryService inventory=context.getBean(InventoryService.class);
   assertTrue(inventory instanceof DefaultInventoryService);
   ProductRepository repository=context.getBean(ProductRepository.class);
   inventory.addProduct(5,"Keyboard");
   assertTrue(repository.hasProduct(5));
   assertEquals("Keyboard",repository.getProduct(5));
   InventoryService alternative=context.getBean("alternativeInventoryService",InventoryService.class);
   assertTrue(alternative.checkProduct(5));
   alternative.removeProduct(5);
   assertFalse(repository.hasProduct(5));
   assertNotNull(context.getBean(OrderService.class));
  }
 }
}