
package mz.uem.poo.laboral;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author José Seie
 */
@Entity
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    
    private String nome;
    
    private char sexo;
    
    private int idade;

    /**
     * Constructor vazio da classe.
     */
    public Pessoa() {
    }

    /**
     * Construtor que recebe parametros para inicializar o objecto.
     * @param nome
     * @param sexo
     * @param idade 
     */
    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
}
