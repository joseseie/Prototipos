package mz.pesquisa.teste;

/**
 *
 * @author José Seie
 */
public class TEste {

    /**
     * Proposta de resolucao de um exercicio (dúvida) de stack overflow
     * @return : Retorna true caso a primeira string numerica seja maior que a segunda string numerica
     */
    public static boolean compara() {
        String strValue01 = "570";
        String strValue02 = "5000";
        
        return strValue01.compareTo(strValue02) > 0;
    }

    public static void main(String[] args) {
        
        System.out.println("Valor lgoico: "+compara());
        
    }
    
}
