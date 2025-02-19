import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

     static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {




        while(true){
            double a;

            do {
                a = le(1);
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "O valor de A precisa ser diferente de zero.");
                }
            } while (a == 0);

            double b = le(2);
            double c = le(3);



            EGrau2 resultado = new EGrau2(a, b, c);
            double deltaValido = resultado.delta();

            if (deltaValido < 0){
                JOptionPane.showMessageDialog(null,"não é possível calcular raízes reais");
            }
            else{
                double raiz1 = resultado.calculax1(deltaValido);
                double raiz2 = resultado.calculax2(deltaValido);
                exibe(raiz1, raiz2);
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja resolver outra equação do segundo grau?", "Continuar", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
                break;
            }
        }
    }

    static double le ( int coeficiente ){
        double valor = 0;
        String input;
        if (coeficiente == 1) {
                input = JOptionPane.showInputDialog("Digite o valor do coeficiente A (diferente de zero): ");
                valor = Double.parseDouble(input);
        } else {
            input = JOptionPane.showInputDialog("Digite o valor do coeficiente " + (coeficiente == 2 ? "B" : "C") + ": ");
            valor = Double.parseDouble(input);
        }

        return valor;

    }

    static void exibe(double raiz1 , double raiz2){
        String resposta = "As raizes são " + raiz1 + " e " + raiz2;
        JOptionPane.showMessageDialog(null, resposta);

    }
}