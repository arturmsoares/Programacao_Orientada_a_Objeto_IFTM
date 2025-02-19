import java.util.ArrayList;

public class Universidade {

    private String nome;
    private ArrayList<Departamento> departamentos; // composição com departamento

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();;
    }

    // Cria e adiciona um Departamento à universidade
    public Departamento criarDepartamento(String nomeDepartamento, String local) {
        Departamento dep = new Departamento(nomeDepartamento,local);
        departamentos.add(dep);
        return dep;                // Esse retorno é associado a uma pessoa
    }


    public void imprimir() {
        System.out.println("Universidade: " + nome);
        System.out.println("Departamentos:");

        for(int i = 0; i < departamentos.size(); i++){
            Departamento dep = departamentos.get(i);   // Obter o departamento usando get()
            System.out.print(i + " - ");
            dep.imprimir();
        }


    }


}
