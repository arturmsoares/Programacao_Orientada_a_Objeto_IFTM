public class App {

    public static void main(String[] args) {

        //Cria a Universidade
        Universidade universidade = new Universidade("UFU");

        // Criando Departamentos dentro da Universidade - Composição
        Departamento depEng = universidade.criarDepartamento("Engenharia","Bloco A");
        Departamento depArt = universidade.criarDepartamento("Artes","Bloco I");

        //Criando pessoas - agregando departamento à pessoa
        Pessoa aluno1 = new Pessoa("João", 20, 'm');
        aluno1.setDepartamento(depArt);
        aluno1.imprimir();


        System.out.println("\nInformações da Universidade:");
        universidade.imprimir();


    }
}
