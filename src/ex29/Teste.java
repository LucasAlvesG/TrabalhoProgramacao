package src.ex29;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Produto p1 = new Produto("Arroz", 10.99, 50);
        Produto p2 = new Produto("Feijão", 5.99, 30);
        Produto p3 = new Produto("Óleo", 7.49, 20);


        Pedido pedido = new Pedido();


        System.out.println("Adicione itens ao pedido (Digite 0 para finalizar):");
        int item = 1;
        while (item != 0) {
            System.out.print("Produto (1-Arroz, 2-Feijão, 3-Óleo): ");
            int produtoSelecionado = scanner.nextInt();

            if (produtoSelecionado == 1) {
                System.out.print("Quantidade de Arroz: ");
                int quantidade = scanner.nextInt();
                pedido.adicionarItem(p1, quantidade);
            } else if (produtoSelecionado == 2) {
                System.out.print("Quantidade de Feijão: ");
                int quantidade = scanner.nextInt();
                pedido.adicionarItem(p2, quantidade);
            } else if (produtoSelecionado == 3) {
                System.out.print("Quantidade de Óleo: ");
                int quantidade = scanner.nextInt();
                pedido.adicionarItem(p3, quantidade);
            }

            System.out.print("Digite 0 para finalizar o pedido ou qualquer número para adicionar mais itens: ");
            item = scanner.nextInt();
        }


        System.out.print("Forma de pagamento (Dinheiro, Cheque, Cartão): ");
        String formaPagamento = scanner.next();
        pedido.setFormaPagamento(formaPagamento);


        pedido.exibirResumoPedido();
    }
}