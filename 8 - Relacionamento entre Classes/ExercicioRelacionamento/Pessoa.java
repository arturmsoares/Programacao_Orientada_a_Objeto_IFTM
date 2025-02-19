public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;
    private Departamento departamento;


    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void imprimir() {
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
        if (departamento != null) {
            System.out.println("Departamento: " + departamento.getNome());
        }
    }


}
