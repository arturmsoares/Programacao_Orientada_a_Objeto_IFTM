import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String senhaCorreta = "1234";

        boolean senhaValida = false;

        do{
            try {
                System.out.println("Digite a senha: ");
                String senhaTentativa = s.nextLine();

                senhaCorreta(senhaTentativa, senhaCorreta);

                System.out.println("Senha correta! Acesso liberado.");
                senhaValida = true; // Sai do loop se a senha estiver correta
            } catch (Exception e) {
                System.err.println(e.getMessage()); // Mostra a mensagem de erro
            }
        }
        while (!senhaValida);

        s.close();
    }

    public static void senhaCorreta(String tentativa, String senhaCorreta) throws Exception {
        if (!tentativa.equals(senhaCorreta)) {
            throw new Exception("Senha Incorreta");
        }
    }
}

