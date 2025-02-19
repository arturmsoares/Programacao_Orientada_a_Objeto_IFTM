public class Validacao extends Exception {

    // Herda de Exception, tornando a clase  validação uma exceção verificada.
    public Validacao(String mensagem){
        super(mensagem);
        // super para chamar o construtor da superclasse (Exception) e passar a mensagem de erro.
    }



}
