package ma.inv.inventoryservice.web;

import lombok.AllArgsConstructor;
import ma.inv.inventoryservice.entities.Product;
import ma.inv.inventoryservice.repositories.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {

    private ProductRepository productRepository;

    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> products(){
        return productRepository.findAll();
    }
}
