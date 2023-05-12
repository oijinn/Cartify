package com.example.cartify.DAO;

import com.example.cartify.Model.Seller;

import javax.ejb.Local;
import java.util.List;

@Local
public interface SellerDAOI {
    Seller create(Seller input);
    Seller update(Seller input);
    boolean bulkUpdate (List<Seller> list, String column, String value);
    boolean delete(Seller input);
    Seller getSellerbyId(Integer id);
    List<Seller> getAllSeller ();
    List<Seller> findByFieldEqual (String column, Object value);
    List<Seller> searchSeller ( String value);
}
