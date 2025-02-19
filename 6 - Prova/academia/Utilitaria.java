package academia;

import java.util.regex.Pattern;

public class Utilitaria {

    
    public String geraCodigo() {
        String[] letras = 
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};
        String[] digitos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            codigo.append(letras[(int) (Math.random() * letras.length)]);
        }
        for (int i = 3; i < 5; i++) {
            codigo.append(digitos[(int) (Math.random() * digitos.length)]);
        }
        return codigo.toString();
    }
    
    public boolean validaTel(String telefone){
        String regex = "\\(3[1-57-9]\\) 9[89][0-9]{3}-[0-9]{4}";

        // metodo Pattern valida o telefone fornecido no parâmetro
        return Pattern.matches(regex, telefone);
    }

}
