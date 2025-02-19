package Etapa3;

public class Retas {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public static int contador=0;

    public Retas(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        contador++;
    }

    public double comprimento(){

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static boolean valida(double x1, double y1, double x2, double y2){
        if ((x1 != x2)  && (y1 != y2)){
            return true;
        }else{
            return false;
        }
    }

    public String exibe (){
        return "Reta de (" + x1 + ", " + y1 + ") a (" + x2 + ", " + y2 + ") com comprimento: " + comprimento();
    }


}
