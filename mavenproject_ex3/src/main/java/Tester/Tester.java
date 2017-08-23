package Tester;

import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Customer c1 = new Customer();
        c1.setName("Joe");
        
        em.persist(c1);
        
        em.getTransaction().commit();
        em.close();
        
    }
    
}
