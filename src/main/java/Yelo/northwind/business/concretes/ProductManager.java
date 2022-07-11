package Yelo.northwind.business.concretes;

import Yelo.northwind.business.abstracts.ProductService;
import Yelo.northwind.core.utilities.results.DataResult;
import Yelo.northwind.core.utilities.results.Result;
import Yelo.northwind.core.utilities.results.SuccessDataResult;
import Yelo.northwind.core.utilities.results.SuccessResult;
import Yelo.northwind.dataAccess.abstracts.ProductDAO;
import Yelo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {
    private final ProductDAO productDao;

    @Autowired
    public ProductManager (ProductDAO dao) {
        super();
        this.productDao = dao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<>("All products returned", this.productDao.findAll()); // The query is done here. Do not search too much
        // prodcutDao extends jpaRepo which is an ORM
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product added");
    }

    @Override
    public DataResult<Product> getProductsByProductName(String productName) {
        return new SuccessDataResult<>("Product returned based on product name: " + productName, this.productDao.getProductsByProductName(productName));
    }

    @Override
    public DataResult<List<Product>>getProductsByProductNameAndCategoryId (String productName, int categoryId) {
        return new SuccessDataResult<>("Products returned based on product name and category id", this.productDao.getProductsByProductNameAndCategoryId(productName, categoryId));
    }

    @Override
    public DataResult<List<Product>> getProductsByCategoryId(int categoryId) {
        return new SuccessDataResult<>("Products returned based on category ID", this.productDao.getProductsByCategoryId(categoryId));
    }

    @Override
    public DataResult<List<Product>> getProductsByProductNameOrCategoryId (String productName, int categoryId) {
        return new SuccessDataResult<>("Data returned based on product name or category ID", this.productDao.getProductsByProductNameOrCategoryId(productName, categoryId));
    }

    @Override
    public DataResult<List<Product>> getProductsByCategoryIdIn(List<Integer> categoryIds) {
        return new SuccessDataResult<>("Products returned based on category IDs", this.productDao.getProductsByCategoryIdIn(categoryIds));
    }

    @Override
    public DataResult<List<Product>> getProductsByProductNameContainingIgnoreCase(String productName) {
        return new SuccessDataResult<>("Products returned based on product name like", this.productDao.getProductsByProductNameContainingIgnoreCase(productName));
    }

    @Override
    public DataResult<List<Product>> getProductBasedOnNameAndCategory(String productName, int id) {
        return new SuccessDataResult<>("Custom Query works", this.productDao.getProductBasedOnNameAndCategory(productName, id));
    }
}
