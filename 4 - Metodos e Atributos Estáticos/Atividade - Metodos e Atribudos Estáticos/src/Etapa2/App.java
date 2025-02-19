package Etapa2;

import Etapa3.Validacao;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        int opcao;

        do{
            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4);

            if (Validacao.valida (x1, y1, x2, y2)){
                Retas reta = new Retas(x1, y1,x2, y2); //se as coordenadas forem válidas, instancia a classe Etapa1.Retas

                JOptionPane.showMessageDialog(null, reta.exibe());

            }else{
                JOptionPane.showMessageDialog(null, "Coordenadas inválidas! Devem estar no primeiro quadrante.");
            }
                JOptionPane.showMessageDialog(null, "Total de retas válidas calculadas: " + Retas.contador);

        opcao = JOptionPane.showConfirmDialog(null, "Deseja repetir o processo?","Continuar", JOptionPane.YES_NO_OPTION);
        }

        while (opcao == JOptionPane.YES_OPTION);
    }



    public static double leCoordenada( int entrada){
        String mensagem;
        switch (entrada) {
            case 1:
                mensagem = "Digite a coordenada x1:";
                break;
            case 2:
                mensagem = "Digite a coordenada y1:";
                break;
            case 3:
                mensagem = "Digite a coordenada x2:";
                break;
            case 4:
                mensagem = "Digite a coordenada y2:";
                break;
            default:
                //cláusula default para tratar qualquer valor de entrada que não seja 1, 2, 3 ou 4, lançando uma exceção se o código for inválido.
                throw new IllegalArgumentException("Código inválido para coordenada");
        }
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));

    }
}