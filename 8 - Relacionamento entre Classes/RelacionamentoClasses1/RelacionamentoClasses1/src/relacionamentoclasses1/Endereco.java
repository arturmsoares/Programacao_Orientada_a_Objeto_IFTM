package relacionamentoclasses1;

public class Endereco {
    private String rua;
    private int numero;
    
    public Endereco(){        
    }
    
    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String imprimir(){
        return "\nRua: " + this.rua + ", " + this.numero;
    }
    
    
    
}
