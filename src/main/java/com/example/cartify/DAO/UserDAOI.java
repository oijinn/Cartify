package com.example.cartify.DAO;

import com.example.cartify.Model.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserDAOI {
    User create(User input);
    User update(User input);
    boolean bulkUpdate (List<User> list, String column, String value);
    boolean delete(User input);
    User getUserbyId(Integer id);
    List<User> getAllUser ();
    List<User> findByFieldEqual (String column, Object value);
}
