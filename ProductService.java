package comlamppdemo02.demo2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {

    private List<Product> productList;

    public ProductService() {
        Product product1 = new Product("Phone",250);
        Product product2 = new Product("Speaker",80);
        Product product3 = new Product("HDD",280);
        Product product4 = new Product("Microphone",70);
        Product product5 = new Product("Laptop",300);
        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
