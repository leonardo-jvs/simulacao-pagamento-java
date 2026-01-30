public void main(String[] args) {

    Cliente p1 = new Cliente();
    Cliente p2 = new Cliente();
    p1.setAproximar(false);
    p2.setAproximar(true);
    System.out.println("Cliente 1");
    p1.comprar();
    System.out.println("Cliente 2");
    p2.comprar();
}



