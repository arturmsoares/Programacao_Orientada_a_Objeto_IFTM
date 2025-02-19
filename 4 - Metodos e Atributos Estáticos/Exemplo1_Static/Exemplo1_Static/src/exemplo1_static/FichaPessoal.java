package exemplo1_static;

/**
 *
 * @author Clarimundo
 */
public class FichaPessoal {
    private String nome;
    private int idade;
    private static int quantidade = 0;
    
    public FichaPessoal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        //quantidade++;  
        //se incrementar no construtor, não precisará do setQuantidade( ) lá no main( )   
    }
    
    public static int getQuantidade(){
        return quantidade;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
         return idade;
    }
    
    public static void setQuantidade(int q){
        quantidade = q;
    }  
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}
