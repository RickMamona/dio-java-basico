package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> comprasCarrinho;

    public CarrinhoCompras() {
        this.comprasCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        comprasCarrinho.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
    List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : comprasCarrinho) {
            if(i.getNome().equals(nome)){
                itemParaRemover.add(i);
            }
        }
        comprasCarrinho.removeAll(itemParaRemover);
    }
    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : comprasCarrinho) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println("O valor total é: " + valorTotal);
    }

    public void exibirItens(){
        System.out.println(comprasCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Arroz", 10.0, 2);
        carrinhoCompras.adicionarItem("Feijão", 5.0, 1);
        carrinhoCompras.calcularValorTotal();
        carrinhoCompras.exibirItens();
        carrinhoCompras.removerItem("Arroz");
        carrinhoCompras.calcularValorTotal();
        carrinhoCompras.exibirItens();
    }
    
}
