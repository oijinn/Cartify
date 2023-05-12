package com.example.cartify.DAO;

import com.example.cartify.Model.Admin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class AdminDAO implements AdminDAOI{
    private EntityManagerFactory emf;


    public Admin create(Admin input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Admin Admin = em.merge(input);
            transaction.commit();
            return Admin;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public Admin update(Admin input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Admin object = em.merge(input);
            transaction.commit();
            return object;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public boolean bulkUpdate (List<Admin> list, String column, String value) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaUpdate<Admin> update = criteriaBuilder.createCriteriaUpdate(Admin.class);
            Root<Admin> root = update.from(Admin.class);
            update.set(root.get(column), value);
            em.createQuery(update).executeUpdate();
            em.getTransaction().commit();
            return true;
        }
        catch (Exception e){
            em.getTransaction().rollback();
            return false;
        }
    }
    public boolean delete(Admin input){
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(input);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }
    public Admin getAdminbyId(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Admin.class, id);
    }

    public List<Admin> getAllAdmin (){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
        Root<Admin> rootEntry = cq.from(Admin.class);
        CriteriaQuery<Admin> all = cq.select(rootEntry);
        return em.createQuery(all).getResultList();
    }
    public List<Admin> findByFieldEqual (String column, Object value){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
        Root<Admin> rootEntry = cq.from(Admin.class);
        cq.where(cb.equal(rootEntry.get(column),value));
        return em.createQuery(cq).getResultList();
    }
}