import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";


        while (true) {
            try {
                System.out.print("Usuário: ");
                String usuario = s.nextLine();
                System.out.print("Senha: ");
                String senha = s.nextLine();
                validarLogin(usuario, senha, usuarioCorreto, senhaCorreta);
                break; // Login bem-sucedido
            } catch (Validacao e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.print("Nome: ");
        String nome = s.nextLine();

        while(true){
            try{
                System.out.print("Telefone no formato (XX)XXXXX-XXXX:");
                String telefone = s.nextLine();
                validarTelefone(telefone);
                System.out.println("Cadastro realizado com sucesso:" +
                        "\nNome: " + nome + "\nTelefone: " + telefone);
                break;
            } catch (Validacao e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

    }

    public static void validarLogin(String usuario, String senha, String usuarioCorreto, String senhaCorreta) throws Validacao {
        if ( !usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)){
            throw new Validacao("Usuário e/ou Senha incorretos.");
        }
    }

    public static void validarTelefone(String telefone) throws Validacao {
        if (!telefone.matches("^\\(\\d{2}\\)\\d{5}-\\d{4}$")) {
            throw new Validacao("Telefone inválido. Deve respeitar o formato: (XX)XXXXX-XXXX");
        }
    }
}
