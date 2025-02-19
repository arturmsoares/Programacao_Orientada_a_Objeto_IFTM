public class Departamento {


    private String nome;
    private String localizacao;


    public Departamento(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;

    }

    public String getNome() {
        return nome;
    }

    public void imprimir(){
        System.out.println(nome + ", " +localizacao);
    }



}
