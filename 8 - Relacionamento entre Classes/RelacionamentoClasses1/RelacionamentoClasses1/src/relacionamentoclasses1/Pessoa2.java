package relacionamentoclasses1;

public class Pessoa2 {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;
    
     public Pessoa2(){
         end = new Endereco();
    }
     
    public Pessoa2(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        end = new Endereco();
    } 
    
    public Pessoa2(String nome, int idade, char sexo, Endereco end){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    public String imprimir(){
        return "NOME: " + this.nome + "\nIDADE: " + this.idade + "\nSEXO: " + this.sexo + end.imprimir();
    }
    
}
