package prova1_ArturMachado_q1;

public class ContaCorrente {

    private String nome;
    private String numeroConta;
    private Double saldo;
    private String tipoConta;

    ContaCorrente (String nome, String numeroConta, Double saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = "comum";
    }

    ContaCorrente (String nome, String numeroConta, Double saldo, String tipoConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    //sacar - conta comum
    public boolean sacar(double valor){
        double taxa = valor * (0.1 /100);
        double valorUtil = valor + taxa;
        if(valorUtil < saldo){
                saldo-= valorUtil;
                return true;
            }
        return false;
    }

    //sacar - conta especial
    public boolean sacar(double valor, double limiteEspecial){
        double limiteTotal = saldo + limiteEspecial;
        double taxa = valor * (0.2 /100);
        double valorUtil = valor + taxa;
        if(valorUtil < limiteTotal){
            saldo -= valorUtil;
            return true;
        }
        return false;
    }



    public void depositar(double valor){
        if (valor > 0) {
            double taxa = valor * (0.1 / 100);
            saldo += (valor - taxa);
        }
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
