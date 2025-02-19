import javax.swing.*;
import java.time.LocalDate;

public class JogadorDeFutebol {

    private String nome;
    public String posicao, nacionalidade;
    public double altura, peso;
    public int anoNascimento;

    public JogadorDeFutebol (String nome, int anoNascimento, double altura, double peso, String nacionalidade, String posicao){
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.anoNascimento = anoNascimento;
    }

    public int calculaIdade(){
        int anoAtual = LocalDate.now().getYear(); //para obter o ano atual;
        return anoAtual - this.anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void exibe (){
        String mensagem = "Nome: " + this.nome + "\n" +
                "Ano de Nascimento: " + this.anoNascimento + "\n" +
                "Altura: " + this.altura + " m\n" +
                "Peso: " + this.peso + " kg\n" +
                "Nacionalidade: " + this.nacionalidade + "\n" +
                "Posição: " + this.posicao;

        JOptionPane.showMessageDialog(null, mensagem);
    }


}
