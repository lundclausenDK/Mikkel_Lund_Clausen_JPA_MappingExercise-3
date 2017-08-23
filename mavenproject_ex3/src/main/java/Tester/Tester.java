package Tester;

import entity.Customer;
import entity.DiscountFixed;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        DiscountFixed df = new DiscountFixed();
        
        Customer c1 = new Customer();
        c1.setName("Joe");
        c1.setDt(df);
        
        
        
        
        em.persist(c1);
        
        em.getTransaction().commit();
        em.close();
        
    }
    
}
