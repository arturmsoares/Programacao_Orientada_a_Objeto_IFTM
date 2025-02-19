package aplicacao;

public class Aluno {

    private String codigo;
    private String nome;
    private String telefone;
    private int acessos;
    int categoria;

    public Aluno(String codigo, String nome, String telefone, int acessos, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = acessos;
        this.categoria = categoria;
    }

    public Aluno(String codigo, String nome, String telefone, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public String exibe() {
        return "Código: " + codigo + "\n" +
               "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "Categoria: " + categoria;
    }

    public String exibe(int acessos) {
        return "Código: " + codigo + "\n" +
               "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "Categoria: " + categoria + "\n" +
               "Acessos: " + acessos;
    }

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }
}
