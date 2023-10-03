package com.example.cartify.DAO;

import com.example.cartify.Model.Customer;
import com.example.cartify.Utilities.Static;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.example.cartify.Utilities.DataSource.getEntityManager;

@Stateless
public class CustomerDAO implements CustomerDAOI{
    private EntityManagerFactory emf = getEntityManager();


    public Customer create(Customer input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Customer Customer = em.merge(input);
            transaction.commit();
            return Customer;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public Customer update(Customer input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Customer object = em.merge(input);
            transaction.commit();
            return object;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public boolean bulkUpdate (List<Customer> list, String column, String value) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaUpdate<Customer> update = criteriaBuilder.createCriteriaUpdate(Customer.class);
            Root<Customer> root = update.from(Customer.class);
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
    public boolean delete(Customer input){
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
    public Customer getCustomerbyId(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Customer.class, id);
    }

    public List<Customer> getAllCustomer (){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
        Root<Customer> rootEntry = cq.from(Customer.class);
        CriteriaQuery<Customer> all = cq.select(rootEntry);
        return em.createQuery(all).getResultList();
    }
    public List<Customer> findByFieldEqual (String column, Object value){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
        Root<Customer> rootEntry = cq.from(Customer.class);
        cq.where(cb.equal(rootEntry.get(column),value));
        return em.createQuery(cq).getResultList();
    }
    public List<Customer> searchCustomer (String value) {
        List<String> columns = Static.getPojoFields(getAllCustomer().get(0));
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
        Root<Customer> rootEntry = cq.from(Customer.class);
        List<Predicate> predicates = new ArrayList<>();
        columns.forEach(x-> {
            predicates.add(cb.like(cb.lower(rootEntry.get(x)),value.toLowerCase(Locale.ROOT)));
        });
        cq.where(cb.or(predicates.toArray(new Predicate[0])));
        return em.createQuery(cq).getResultList();
    }
}