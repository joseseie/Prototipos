
package mz.uem.poo.laboral;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author José Seie
 */
public class Controlo {
    
    public void addOjects(Session s, Transaction t){
        
        JOptionPane.showMessageDialog(null, "Crie os objectos, para terminar digite t");
        String condicao;
        do {
            Pessoa p = new Pessoa();
            p.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa"));
            p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa")));
            p.setSexo((JOptionPane.showInputDialog("digite O sexo")).toUpperCase().charAt(0));
            condicao = JOptionPane.showInputDialog("Deseja continuar? \nS/N");
            s.save(p);
            t.commit();
        } while (!condicao.toUpperCase().equals("N"));             
              
    }
    
    public List<Pessoa> lerTodos(Session s, Transaction t){
        return s.createCriteria(Pessoa.class).list();
    }
    
    public Pessoa getSome(Session s, Transaction t,int id){
        return (Pessoa) s.get(Pessoa.class, id);
    }
    
    public boolean removeSome(Session s, Transaction t,int id){
        s.delete(s.get(Pessoa.class, id));
        return true;
    }
    
    
    
    
}
