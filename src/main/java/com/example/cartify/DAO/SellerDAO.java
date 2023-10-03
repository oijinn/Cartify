package com.example.cartify.DAO;

import com.example.cartify.Model.Seller;
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
public class SellerDAO implements SellerDAOI{
    private EntityManagerFactory emf = getEntityManager();


    public Seller create(Seller input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Seller result = em.merge(input);
            transaction.commit();
            return result;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public Seller update(Seller input) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Seller object = em.merge(input);
            transaction.commit();
            return object;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return null;
        }
    }
    public boolean bulkUpdate (List<Seller> list, String column, String value) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaUpdate<Seller> update = criteriaBuilder.createCriteriaUpdate(Seller.class);
            Root<Seller> root = update.from(Seller.class);
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
    public boolean delete(Seller input){
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
    public Seller getSellerbyId(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Seller.class, id);
    }

    public List<Seller> getAllSeller (){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Seller> cq = cb.createQuery(Seller.class);
        Root<Seller> rootEntry = cq.from(Seller.class);
        CriteriaQuery<Seller> all = cq.select(rootEntry);
        return em.createQuery(all).getResultList();
    }
    public List<Seller> findByFieldEqual (String column, Object value){
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Seller> cq = cb.createQuery(Seller.class);
        Root<Seller> rootEntry = cq.from(Seller.class);
        cq.where(cb.equal(rootEntry.get(column),value));
        return em.createQuery(cq).getResultList();
    }
    public List<Seller> searchSeller ( String value) {
        List<String> columns = Static.getPojoFields(getAllSeller().get(0));
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Seller> cq = cb.createQuery(Seller.class);
        Root<Seller> rootEntry = cq.from(Seller.class);
        List<Predicate> predicates = new ArrayList<>();
        columns.forEach(x-> {
            predicates.add(cb.like(cb.lower(rootEntry.get(x)),value.toLowerCase(Locale.ROOT)));
        });
        cq.where(cb.or(predicates.toArray(new Predicate[0])));
        return em.createQuery(cq).getResultList();
    }
}
