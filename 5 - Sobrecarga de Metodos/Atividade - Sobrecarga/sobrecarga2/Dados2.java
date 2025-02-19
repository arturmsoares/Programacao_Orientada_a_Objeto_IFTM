package sobrecarga2;

public class Dados2 {
    int a, b;
    float c, d;
    
    Dados2(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Dados2(float c, float d) {
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
