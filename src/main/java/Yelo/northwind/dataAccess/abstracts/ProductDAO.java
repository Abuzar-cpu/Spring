package Yelo.northwind.dataAccess.abstracts;

import Yelo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository <Product, Integer> {
}
