package com.example.cartify.DAO;

import com.example.cartify.Model.Order;

import javax.ejb.Local;
import java.util.List;

@Local
public interface OrderDAOI {
    Order create(Order input);
    Order update(Order input);
    boolean bulkUpdate (List<Order> list, String column, String value);
    boolean delete(Order input);
    Order getOrderbyId(Integer id);
    List<Order> getAllOrder ();
    List<Order> findByFieldEqual (String column, Object value);
    List<Order> findByConditionLike (String column , String value);
}
