package src.ex29;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Pedido {

    private List<ItemPedido> itens;
    private String formaPagamento;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
        System.out.println("Item adicionado ao pedido.");
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void exibirResumoPedido() {
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNome() + " - " + item.getQuantidade() + " unidades");
        }
        System.out.println("Total a pagar: R$" + calcularTotal());
        System.out.println("Forma de pagamento: " + formaPagamento);
    }

    private double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }
}
