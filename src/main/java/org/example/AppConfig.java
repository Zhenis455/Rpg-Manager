package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {
    @Component
    public static class EagerSingleton {
        public EagerSingleton() {
            System.out.println("Eager Singleton Initialized");
        }
    }

    @Component
    @Lazy
    public static class LazySingleton {
        public LazySingleton() {
            System.out.println("Lazy Singleton Initialized");
        }
    }
}
