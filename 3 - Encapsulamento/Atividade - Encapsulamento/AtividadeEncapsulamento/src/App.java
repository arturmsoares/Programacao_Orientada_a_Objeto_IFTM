import javax.swing.*;

public class App {

    public static void main(String[] args) {

    JogadorDeFutebol jogador = leDados();
    String mensagem = tempoAposentadoria(jogador);
    JOptionPane.showMessageDialog(null, mensagem);

    }

    public static JogadorDeFutebol leDados(){
        String nome = JOptionPane.showInputDialog("Digite o nome do jogador:");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do jogador:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do jogador em metros:"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do jogador em kg:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade do jogador:");
        String posicao;
        while (true) {
            posicao = JOptionPane.showInputDialog("Digite a posição do jogador (atacante/meio de campo/defensor):");

            if (posicao.equalsIgnoreCase("atacante") ||
                    posicao.equalsIgnoreCase("meio de campo") ||
                    posicao.equalsIgnoreCase("defensor")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Posição inválida. Por favor, digite 'atacante', 'meio de campo' ou 'defensor'.");
            }
        }

        JogadorDeFutebol jogador = new JogadorDeFutebol(nome, anoNascimento, altura, peso, nacionalidade, posicao);
        return jogador;
    }

    public static String tempoAposentadoria(JogadorDeFutebol jogador){
        int tempoRestante = 0;
        int idade = jogador.calculaIdade();
        if(jogador.posicao.equalsIgnoreCase("atacante")){
            tempoRestante = 35- idade;

        }else if (jogador.posicao.equalsIgnoreCase("meio de campo")){
            tempoRestante = 38 - idade;
        }
        else if(jogador.posicao.equalsIgnoreCase("defensor")){
            tempoRestante = 40 - idade;
        }

        return "Faltam " + tempoRestante + " ano (s) para o jogador " + jogador.getNome() + " se aposentar.";
    }


}