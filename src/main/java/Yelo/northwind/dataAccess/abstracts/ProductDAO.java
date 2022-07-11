package Yelo.northwind.dataAccess.abstracts;

import Yelo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductDAO extends JpaRepository <Product, Integer> {
    Product getProductsByProductName(String productName);
    List<Product> getProductsByCategoryId(int categoryId);
    List<Product> getProductsByProductNameAndCategoryId(String productName, int categoryId);
    List<Product> getProductsByProductNameOrCategoryId (String productName, int categoryId);
    List<Product> getProductsByCategoryIdIn(List<Integer> categoryIds);
    List<Product> getProductsByProductNameContainingIgnoreCase(String productName);

    // Custom Query
    // NOTE: There should not be spaces around =: operator
    @Query("From Product as p WHERE p.productName=:productName AND p.category.id=:id")
    List<Product> getProductBasedOnNameAndCategory(String productName, int id); 
}
