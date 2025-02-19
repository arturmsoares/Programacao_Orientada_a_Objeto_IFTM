package aplicacao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import academia.Utilitaria;

public class App {

    private static List<Aluno> listaAlunos = new ArrayList<>();
    private static int totalAcessos = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Academia \n" +
                                                                     "2 - Personal \n" +
                                                                     "3 - Sair"));
            switch (opcao) {
                case 1 -> {
                    String usuario = JOptionPane.showInputDialog("Digite o usuário:");
                    String senha = JOptionPane.showInputDialog("Digite a senha:");
                    if (validarFuncionario(usuario, senha)) {
                        subMenuAcademia();
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso negado. Retornando ao menu principal.");
                    }
                }
                case 2 -> subMenuPersonal();
                case 3 -> JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void subMenuAcademia() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastro \n" +
                                                                     "2 - Relatório \n" +
                                                                     "3 - Voltar"));
            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> exibirRelatorio();
                case 3 -> JOptionPane.showMessageDialog(null, "Voltando ao menu principal.");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void subMenuPersonal() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Consultar Aluno \n" +
                                                                     "2 - Registrar Treino \n" +
                                                                     "3 - Voltar"));
            switch (opcao) {
                case 1 -> consultarAluno();
                case 2 -> registrarTreino();
                case 3 -> JOptionPane.showMessageDialog(null, "Voltando ao menu principal.");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static boolean validarFuncionario(String usuario, String senha) {
        String[] usuarios = {"usuario1", "usuario2", "usuario3"};
        String[] senhas = {"senha1", "senha2", "senha3"};

        for (int tentativas = 0; tentativas < 3; tentativas++) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i].equals(usuario) && senhas[i].equals(senha)) {
                    JOptionPane.showMessageDialog(null, "Acesso permitido. Bem-vindo!");
                    return true;
                }
            }
            if (tentativas < 2) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente.");
            }
        }
        return false;
    }

    public static void cadastrarAluno() {
        Utilitaria util = new Utilitaria();

        String codigo = util.geraCodigo();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido. Cadastro não realizado.");
            return;
        }

        for (Aluno aluno : listaAlunos) {
            if (aluno.exibe().contains(nome)) {
                JOptionPane.showMessageDialog(null, "O nome já está cadastrado. Cadastro não realizado.");
                return;
            }
        }

        String telefone = JOptionPane.showInputDialog("Digite o telefone no formato (xx) xxxxx-xxxx:");
        if (!util.validaTel(telefone)) {
            JOptionPane.showMessageDialog(null, "Telefone inválido. Cadastro não realizado.");
            return;
        }

        int categoria;
        try {
            categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite a categoria (1, 2 ou 3):"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Categoria inválida. Cadastro não realizado.");
            return;
        }

        if (categoria < 1 || categoria > 3) {
            JOptionPane.showMessageDialog(null, "Categoria inválida. Cadastro não realizado.");
            return;
        }

        Aluno novoAluno = new Aluno(codigo, nome, telefone, 0, categoria);
        listaAlunos.add(novoAluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!\nCódigo: " + codigo);
    }

    public static void exibirRelatorio() {
        if (listaAlunos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
            return;
        }
    
        StringBuilder relatorio = new StringBuilder();
        int totalAcessos = 0;
    
        for (Aluno aluno : listaAlunos) {
            relatorio.append(aluno.exibe(aluno.getAcessos())).append("\n\n");
            totalAcessos += aluno.getAcessos();
        }
    
        relatorio.append("TOTAL DE ALUNOS = ").append(listaAlunos.size()).append("\n")
                 .append("ACESSOS = ").append(totalAcessos);
    
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }
    


    public static void consultarAluno() {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno para consulta:");
        for (Aluno aluno : listaAlunos) {
            if (aluno.exibe().contains(nome)) {
                JOptionPane.showMessageDialog(null, aluno.exibe());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
    }

    public static void registrarTreino() {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno para registrar o treino:");
        for (Aluno aluno : listaAlunos) {
            if (aluno.exibe().contains(nome)) {
                aluno.setAcessos(aluno.getAcessos() + 1);
                totalAcessos++;
                JOptionPane.showMessageDialog(null, "Treino registrado com sucesso para o aluno: " + nome);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
    }
}