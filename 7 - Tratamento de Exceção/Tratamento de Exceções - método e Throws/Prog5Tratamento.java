public class Prog5Tratamento {

    public static void main (String[] args){

        int [] num = {4, 8, 5, 16, 32, 21, 64, 128, 62, 80, 90};
        int [] den = {2, 0, 4, 8, 0, 2, 4};

        for( int i = 0; i < num.length; i++){
            try{
                numPar(num[i], den[i]);
                System.out.println(num[i] + "/" + den[i] + "=" + (num[i]/den[i]));;

            } catch (ArithmeticException  ex1) {
                System.out.println("Aconteceu um Erro: operação aritmética inválida");
            } catch (ArrayIndexOutOfBoundsException ex2) {
                System.out.println("Aconteceu um Erro: índice acessado não existe !");
            }
            catch (DivisaoNaoExata ex){
                System.out.println(ex.toString());
            }
        }
    }

    public static void numPar(int num, int den) throws DivisaoNaoExata{
            if (num % 2 != 0)
                throw new DivisaoNaoExata(num, den);
    }

}
