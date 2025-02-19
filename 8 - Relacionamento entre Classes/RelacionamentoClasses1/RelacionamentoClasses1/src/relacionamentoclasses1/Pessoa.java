package relacionamentoclasses1;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private String rua;
    private int numero;
    
    public Pessoa(){
    }
    
    public Pessoa(String nome, int idade, char sexo, String rua, int numero){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rua = rua;
        this.numero = numero;
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

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
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

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String imprimir(){
        return "NOME: " + this.nome + "\nIDADE: " + this.idade + "\nSEXO: " + this.sexo + "\nRua: " + this.rua + ", " + this.numero;
    }
    
}
