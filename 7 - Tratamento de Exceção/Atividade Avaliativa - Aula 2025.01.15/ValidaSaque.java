import java.util.Scanner;

public class ValidaSaque {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Double saque;

        boolean saqueValido = false;

        do{
            try {
                System.out.println("Informe o valor do saque: ");
                saque = s.nextDouble();

                validaSaque(saque);

                System.out.println("Valor permitido. Retire o dinheiro!");
                saqueValido = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        while (!saqueValido);

        s.close();
    }

    public static void validaSaque(Double saque) throws Exception {
        if (saque>2000) {
            throw new Exception("Valor maior que o permitido");
        }
    }
}
