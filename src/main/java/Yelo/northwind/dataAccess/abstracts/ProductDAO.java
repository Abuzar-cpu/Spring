package Yelo.northwind.dataAccess.abstracts;

import Yelo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository <Product, Integer> {
    Product getProductsByProductName(String productName);
    List<Product> getProductsByCategoryId(int categoryId);
    List<Product> getProductsByProductNameAndCategoryId(String productName, int categoryId);
    List<Product> getProductsByProductNameOrCategoryId (String productName, int categoryId);
}
