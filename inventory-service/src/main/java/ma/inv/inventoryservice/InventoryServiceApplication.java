package ma.inv.inventoryservice;

import ma.inv.inventoryservice.entities.Product;
import ma.inv.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Product 1")
                    .quantity(1862)
                    .price(5600)
                    .id(UUID.randomUUID().toString())
                    .build());
            productRepository.save(Product.builder()
                    .name("Product 2")
                    .quantity(52)
                    .price(12000)
                    .id(UUID.randomUUID().toString())
                    .build());
            productRepository.save(Product.builder()
                    .name("Product 3")
                    .quantity(4565)
                    .price(85400)
                    .id(UUID.randomUUID().toString())
                    .build());
        };
    }
}
