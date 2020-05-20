package comlamppdemo02.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Scope
@RestController

public class BasketController {


    private ProductService productService;

    public BasketController() {

    }

    @Autowired
    public BasketController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> get() {
        return productService.getProductList();
    }
}

