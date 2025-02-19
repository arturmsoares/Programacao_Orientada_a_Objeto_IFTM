package sobrecarga1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Adicao1 adicao = new Adicao1();
        Dados1 dados = new Dados1(10, 20);
        Dados1 dados2 = new Dados1(10.5f, 20.5f);
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção (1 ou 2):"));
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, adicao.exibeInt(dados.getA(), dados.getB() ));
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, adicao.exibeFloat(dados2.getC(), dados2.getD()));
        } else  {
            JOptionPane.showMessageDialog(null, "opção invalida");
        }
    }
}
