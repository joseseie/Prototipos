
package mz.pesquisa.hib;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author José Seie
 */
public class Teste {
    
    public static void main(String[] args) {
         
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        
        s.close();
        
        
    }
    
}
