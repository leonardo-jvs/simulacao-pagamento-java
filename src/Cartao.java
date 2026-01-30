public class Cartao {
    private boolean aproximar;
    private float limite;
    private float saldo;
    public Cartao(){
        this.limite = 2000;
        this.saldo = 1000;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {

        this.limite = limite ;
    }

    public boolean isAproximar() {
        return aproximar;
    }

    public void setAproximar(boolean aproximar) {
        this.aproximar = aproximar;

    }

}
