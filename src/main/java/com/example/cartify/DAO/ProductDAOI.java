package com.example.cartify.DAO;

import com.example.cartify.Model.Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductDAOI {
    Product create(Product input);
    Product update(Product input);
    boolean bulkUpdate (List<Product> list, String column, String value);
    boolean delete(Product input);
    Product getProductbyId(Integer id);
    List<Product> getAllProduct ();
    List<Product> findByFieldEqual (String column, Object value);
    List<Product> findByConditionLike (String column , String value);
    List<Product> SellerFindByConditionLike(String column , String value, String column1, String value1);

}
