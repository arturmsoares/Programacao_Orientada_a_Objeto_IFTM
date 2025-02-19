package exemplo1_static;

/**
 *
 * @author Clarimundo
 */
public class Exemplo1_Static {

    public static void exibe(FichaPessoal p){
       System.out.println("NOME: "+p.getNome());
       System.out.println("IDADE: "+p.getIdade()+"\n");       
    }
    
    public static void main(String[] args) {
        FichaPessoal p1 = new FichaPessoal("Maria Jose",68);
        exibe(p1);
        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade()+1);        
        FichaPessoal p2 = new FichaPessoal("Paulo Gomes",14);
        exibe(p2);
        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade()+1);
        System.out.println("Há "+FichaPessoal.getQuantidade()+" pessoas cadastradas");
    }
    
}
