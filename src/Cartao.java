public class Cartao {
    private boolean aproximar;
    private double limite;
    private double saldo;
    public Cartao(){
        this.limite = 2000;
        this.saldo = 1000;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {

        this.limite = limite ;
    }

    public boolean isAproximar() {
        return aproximar;
    }

    public void setAproximar(boolean aproximar) {
        this.aproximar = aproximar;

    }

}
