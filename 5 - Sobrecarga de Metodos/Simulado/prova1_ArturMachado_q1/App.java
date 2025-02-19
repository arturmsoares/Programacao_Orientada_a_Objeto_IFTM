package prova1_ArturMachado_q1;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
        String numeroConta = JOptionPane.showInputDialog(null, "Digite o numero da Conta Corrente:");
        Double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo da Conta Corrente:"));
        String tipoConta = JOptionPane.showInputDialog(null, "Digite o tipo da conta:");
        Double limiteEspecial = 0.0;

        if (tipoConta.equals("especial")){
            limiteEspecial = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite da conta:"));
        }

        ContaCorrente conta = new ContaCorrente(nome, numeroConta, saldo, tipoConta);
        menu(conta, limiteEspecial);
    }

    public static void menu(ContaCorrente conta, Double limiteEspecial) {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Saque \n" + "2 - Depósito \n" + "3 - Sair"));
            switch (opcao) {
                case 1:
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque:"));
                    if (conta.getTipoConta().equals("especial")) {
                        conta.sacar(valorSaque, limiteEspecial);
                        }
                    else {
                        conta.sacar(valorSaque);
                    }
                    exibir(conta, limiteEspecial);
                    break;
                case 2:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito:"));
                    conta.depositar(valorDeposito);
                    exibir(conta, limiteEspecial);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do menu.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

    }

    public static void exibir(ContaCorrente conta, Double limiteEspecial) {
        String exibicao = "Nome: " + conta.getNome() + "\n"
                + "Número da Conta: " + conta.getNumeroConta() + "\n"
                + "Tipo de Conta: " + (conta.getTipoConta().equals("especial") ? "especial" : "comum") + "\n";

                    if (conta.getTipoConta().equals("especial")) {
                        exibicao += "Limite: R$" + String.format("%.2f", limiteEspecial) + "\n";
                    }

                exibicao += "Saldo: R$" + String.format("%.2f", conta.getSaldo()) + "\n";

        JOptionPane.showMessageDialog(null, exibicao);
    }


}