package relacionamentoclasses1;

/**
 *
 * @author Clarimundo
 */
public class RelacionamentoClasses1 {

    public static void main(String[] args) {

    /*    Sem associação nenhuma
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(23);
        p.setSexo('f');
        p.setRua("Afonso Pena");
        p.setNumero(234);
        System.out.println(p.imprimir()); */
        
        //Com agregação simples
  /*      Pessoa2 p2 = new Pessoa2();
        p2.setNome("João");
        p2.setIdade(40);
        p2.setSexo('m'); */
    //    Pessoa2 p2 = new Pessoa2("João",40,'m');
   /*     Endereco end = new Endereco();
        end.setRua("Rondom Pacheco");
        end.setNumero(1002); 
        Pessoa2 p2 = new Pessoa2("João",40,'M',end);  
  //      p2.setEnd(end);  // associação realizada
        System.out.println("\n\n" + p2.imprimir()); */
        
        //Com composição  
   /*   Pessoa3 p3 = new Pessoa3();
        p3.setNome("Adriana");
        p3.setIdade(36);
        p3.setSexo('f');
      //Pessoa3 p3 = new Pessoa3("Adriana",36,'f');
        p3.setEnderecos("Afonso Pena",234);
        p3.setEnderecos("Constelação",12);
        p3.setEnderecos("Cesário Alvim",100);
        System.out.println("\n\n" + p3.imprimir());  */
        
    }
    
}
