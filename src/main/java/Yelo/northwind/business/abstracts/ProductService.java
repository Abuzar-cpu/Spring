package Yelo.northwind.business.abstracts;

import Yelo.northwind.core.utilities.results.DataResult;
import Yelo.northwind.core.utilities.results.Result;
import Yelo.northwind.entities.concretes.Product;
import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);

    DataResult<Product> getProductsByProductName(String productName);
    DataResult<List<Product>> getProductsByCategoryId(int categoryId);
    DataResult<List<Product>>getProductsByProductNameAndCategoryId (String productName, int categoryId);

    DataResult<List<Product>> getProductsByProductNameOrCategoryId (String productName, int categoryId);
}
