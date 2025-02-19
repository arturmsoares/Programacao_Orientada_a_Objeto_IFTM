package paridadecomfuncoes;

import javax.swing.JOptionPane;

public class ParidadeComFuncoes {

    public static void violacao()
    {
        JOptionPane.showMessageDialog(null,"O número não pode ser negativo","RESTRICÃO",1);
    }
    
    public static void exibeParidade(int num)
    {
        if(par(num))
            JOptionPane.showMessageDialog(null,"O número " + num + " é par!","SAÍDA",1);
        else
            JOptionPane.showMessageDialog(null,"O número " + num + " é ímpar!","SAÍDA",1);
    }
    
    public static int le()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural: "));
        return num;
    }
    
    public static boolean par(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {

        int num = le();
        if(num < 0)
            violacao();
        else
            exibeParidade(num);
        System.exit(0);
    }
    
}
