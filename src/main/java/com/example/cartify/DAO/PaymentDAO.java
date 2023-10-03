package com.example.cartify.DAO;

import com.example.cartify.Model.Payment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import java.util.List;
import java.util.Locale;

import static com.example.cartify.Utilities.DataSource.getEntityManager;

@Stateless
public class PaymentDAO implements PaymentDAOI{
    private EntityManagerFactory emf = getEntityManager();


    public Payment create(Payment input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Payment Payment = em.merge(input);
            transaction.commit();
            return Payment;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public Payment update(Payment input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Payment object = em.merge(input);
            transaction.commit();
            return object;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public boolean bulkUpdate (List<Payment> list, String column, String value) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaUpdate<Payment> update = criteriaBuilder.createCriteriaUpdate(Payment.class);
            Root<Payment> root = update.from(Payment.class);
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
    public boolean delete(Payment input){
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
    public Payment getPaymentbyId(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Payment.class, id);
    }

    public List<Payment> getAllPayment (){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Payment> cq = cb.createQuery(Payment.class);
        Root<Payment> rootEntry = cq.from(Payment.class);
        CriteriaQuery<Payment> all = cq.select(rootEntry);
        return em.createQuery(all).getResultList();
    }
    public List<Payment> findByFieldEqual (String column, Object value){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Payment> cq = cb.createQuery(Payment.class);
        Root<Payment> rootEntry = cq.from(Payment.class);
        cq.where(cb.equal(rootEntry.get(column),value));
        return em.createQuery(cq).getResultList();
    }
    public List<Payment> findByConditionLike (String column , String value) {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Payment> cq = cb.createQuery(Payment.class);
        Root<Payment> rootEntry = cq.from(Payment.class);
        cq.where(cb.like(cb.lower(rootEntry.get(column)),value.toLowerCase(Locale.ROOT)));
        return em.createQuery(cq).getResultList();
    }
}