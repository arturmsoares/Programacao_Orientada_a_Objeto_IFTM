package sobrecarga1;

public class Dados1 {
    int a, b;
    float c, d;
    
    Dados1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Dados1(float c, float d) {
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }
}
