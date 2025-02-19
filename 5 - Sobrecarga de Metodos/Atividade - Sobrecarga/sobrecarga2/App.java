package sobrecarga2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Adicao2 adicao = new Adicao2();
        Dados2 dados = new Dados2(10, 20);
        Dados2 dados2 = new Dados2(10.5f, 20.5f);

        int opcao;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite:\n1 - Somar inteiros\n2 - Somar reais\n3 - Sair da aplicação"));

                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, 
                            "Resultado da soma (inteiros): " + adicao.exibe(dados.getA(), dados.getB()));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, 
                            "Resultado da soma (reais): " + adicao.exibe(dados2.getC(), dados2.getD()));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saindo da aplicação!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número inteiro.");
                opcao = 0; // Mantém no loop para nova tentativa
            }
        } while (opcao != 3);
    }
}
