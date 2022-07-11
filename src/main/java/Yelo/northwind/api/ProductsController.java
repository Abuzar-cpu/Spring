package Yelo.northwind.api;

import Yelo.northwind.business.abstracts.ProductService;
import Yelo.northwind.core.utilities.results.DataResult;
import Yelo.northwind.core.utilities.results.Result;
import Yelo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductsController {

    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getProductsByProductName(@RequestParam String productName) {
        return this.productService.getProductsByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<List<Product>>getProductsByProductNameAndCategoryId (@RequestParam String productName, @RequestParam int categoryId) {
        return this.productService.getProductsByProductNameAndCategoryId(productName, categoryId);
    }

    @GetMapping("/getByCategoryId")
    public DataResult<List<Product>> getProductsByCategoryId(@RequestParam int categoryId) {
        return this.productService.getProductsByCategoryId(categoryId);
    }

    @GetMapping("getProductsByProductNameOrCategoryId")
    public DataResult<List<Product>> getProductsByProductNameOrCategoryId(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getProductsByProductNameOrCategoryId(productName, categoryId);
    }

    @GetMapping("getProductsByCategoryIdIn")
    public DataResult<List<Product>> getProductsByCategoryIdIn(@RequestParam List<Integer> categoryIds) {
        return this.productService.getProductsByCategoryIdIn(categoryIds);
    }

    @GetMapping("getProductsByProductNameContainingIgnoreCase")
    DataResult<List<Product>> getProductsByProductNameContainingIgnoreCase(@RequestParam String productName) {
        return this.productService.getProductsByProductNameContainingIgnoreCase(productName);
    }

    @GetMapping("custom")
    DataResult<List<Product>> getProductBasedOnNameAndCategory(@RequestParam String productName, @RequestParam int id) {
        return this.productService.getProductBasedOnNameAndCategory(productName, id);
    }
}
