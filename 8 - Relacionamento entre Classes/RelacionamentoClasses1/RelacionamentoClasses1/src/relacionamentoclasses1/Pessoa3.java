package relacionamentoclasses1;

import java.util.ArrayList;

public class Pessoa3 {
    
    private String nome;
    private int idade;
    private char sexo;
    private ArrayList<Endereco> enderecos;
    
     public Pessoa3(){
        this.enderecos = new ArrayList();
    }
     
    public Pessoa3(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.enderecos = new ArrayList();
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
    
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
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

    public void setEnderecos(String rua, int num) {
        this.enderecos.add(new Endereco(rua,num));
    }
       
    public String imprimir(){
        String s = "";
        s += "NOME: " + this.nome + "\nIDADE: " + this.idade + "\nSEXO: " + this.sexo + "\nENDEREÇOS: ";
        for(Endereco e: enderecos) 
            s += e.imprimir();
        return s;
    }

   

   
    
}
