package com.redhat.productos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProductosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola mundo redhat");
    }
}
