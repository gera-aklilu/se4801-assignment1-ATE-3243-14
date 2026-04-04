// ID: ATE/3243/14
package com.shopwave;

import com.shopwave.model.Category;
import com.shopwave.model.Product;
import com.shopwave.repository.CategoryRepository;
import com.shopwave.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category electronics = categoryRepository.save(
                Category.builder()
                        .name("Electronics")
                        .description("Smart devices and digital equipment")
                        .build()
        );

        Category clothing = categoryRepository.save(
                Category.builder()
                        .name("Clothing")
                        .description("Apparel and fashion items")
                        .build()
        );


        productRepository.save(Product.builder()
                .name("Bluetooth Speaker")
                .description("Portable speaker with high-quality sound")
                .price(new BigDecimal("149.99"))
                .stock(80)
                .category(electronics)
                .build()
        );

        productRepository.save(Product.builder()
                .name("iPhone")
                .description("Latest generation smartphone with advanced features")
                .price(new BigDecimal("999.99"))
                .stock(40)
                .category(electronics)
                .build()
        );

        productRepository.save(Product.builder()
                .name("Wireless Headphones")
                .description("Noise-cancelling over-ear headphones")
                .price(new BigDecimal("249.99"))
                .stock(100)
                .category(electronics)
                .build()
        );


        productRepository.save(Product.builder()
                .name("Denim Jacket")
                .description("Stylish and durable denim jacket")
                .price(new BigDecimal("119.99"))
                .stock(50)
                .category(clothing)
                .build()
        );

        System.out.println("Data seeded successfully.");
    }
}