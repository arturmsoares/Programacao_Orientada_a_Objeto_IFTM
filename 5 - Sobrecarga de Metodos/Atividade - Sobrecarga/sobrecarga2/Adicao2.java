package sobrecarga2;

public class Adicao2 {
    
    public int soma(int a, int b) {
        return a + b;
    }

    public float soma(float c, float d) {
        return c + d;
    }

    public String exibe(int a, int b) {
        return "O valor de a + b é: " + soma(a, b);
    }

    public String exibe(float c, float d) {
        return "O valor de c + d é: " + soma(c, d);
    }
}
