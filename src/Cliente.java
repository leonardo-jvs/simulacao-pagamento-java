import java.util.Scanner;

public class Cliente extends Cartao {
    public void comprar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha Um Produto: ");
        System.out.println("1: ProdutoXX 1000$");
        System.out.println("2: ProdutoYY 1500$");
        System.out.println("3: ProdutoZZ 3000$");
        int comprar;
        int valor = 0;
        comprar = teclado.nextInt();

        switch (comprar) {
            case 1:
                System.out.println("Você Escolheu o ProdutoXX 1000$");
                valor = 1000;
                break;
            case 2:
                System.out.println("Você Escolheu o ProdutoYY 1500$");
                valor = 1500;
                break;
            case 3:
                System.out.println("Você Escolheu o ProdutoZZ 3000$");
                valor = 3000;
        }
        System.out.println("----------------------------");
        System.out.println("   MAQUININHA PAGFLASH   ");
        System.out.println("Escolha a Forma de Pagamento: ");
        int opcao;
        do {
            System.out.println("1: PIX ");
            System.out.println("2: DÉBITO ");
            System.out.println("3: CRÉDITO ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (getSaldo() >= valor) {
                        System.out.println(" GERANDO QRCODE...");
                        System.out.println("Pagamento Efetuado!");
                        System.out.println("Parabéns Pela Compra!");
                    } else {
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                case 2:
                    if (isAproximar() && getSaldo() >= valor) {
                        System.out.println("VERIFICANDO CARTÃO DE DÉBITO...");
                        System.out.println("Pagamento Efetuado!");
                        System.out.println("Parabéns Pela Compra!");
                    } else if (!isAproximar() && getSaldo() >= valor) {
                        System.out.println("Digite a Senha: ****");
                        System.out.println("Pagamento Efetuado!");
                        System.out.println("Parabéns Pela Compra!");
                    } else {
                        System.out.println("Saldo Insuficiente!");
                    }
                    break;
                case 3:
                    if (isAproximar() && getLimite() >= valor) {
                        System.out.println("VERIFICANDO CARTÃO DE CRÉDITO...");
                        System.out.println("Pagamento Efetuado!");
                        System.out.println("Parabéns Pela Compra!");
                    } else if (!isAproximar() && getLimite() >= valor) {
                        System.out.println("Digite a Senha: ******");
                        System.out.println("Pagamento Efetuado!");
                        System.out.println("Parabéns Pela Compra!");
                    } else {
                        System.out.println("Compra Negada!");
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
            break;
        } while (true);
    }
}

