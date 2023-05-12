package com.example.cartify.DAO;

import com.example.cartify.Model.Admin;

import javax.ejb.Local;
import java.util.List;

@Local
public interface AdminDAOI {
    Admin create(Admin input);
    Admin update(Admin input);
    boolean bulkUpdate (List<Admin> list, String column, String value);
    boolean delete(Admin input);
    Admin getAdminbyId(Integer id);
    List<Admin> getAllAdmin ();
    List<Admin> findByFieldEqual (String column, Object value);
}
