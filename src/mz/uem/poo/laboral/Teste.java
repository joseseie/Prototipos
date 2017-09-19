
package mz.uem.poo.laboral;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author José Seie
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Jose Seie", 'M', 0);
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        
        s.save(p);
        
        t.commit();
        s.close();
    }
    
}
