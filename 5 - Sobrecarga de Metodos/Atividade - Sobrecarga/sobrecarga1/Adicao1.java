package sobrecarga1;

public class Adicao1 
{
    public int addInt(int a, int b) {
        return a + b;
    }

    public float addFloat(float c, float d) {
        return c + d;
    }

    public String exibeInt(int a, int b) {
        return "O valor de a + b é: " + addInt(a, b);
    }

    public String exibeFloat(float c, float d) {
        return "O valor de c + d é: " + addFloat(c, d);
    }
}
