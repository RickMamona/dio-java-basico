package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome,double preco, int quantidade ){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }            
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (produtoMaisCaro == null || p.getPreco() > produtoMaisCaro.getPreco()) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (produtoMaisBarato == null || p.getPreco() < produtoMaisBarato.getPreco()) {
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQuantidadeValorTotal = null;
        double maiorValorTotal = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                double valorTotal = p.calcularValorTotal();
                if (maiorQuantidadeValorTotal == null || valorTotal > maiorValorTotal ) {
                    maiorQuantidadeValorTotal = p;
                    maiorValorTotal = valorTotal;
                }
            }
        }
        return maiorQuantidadeValorTotal;

    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProduto();

        estoque.adicionarProduto(1L, "Produto A", 5, 10);
        estoque.adicionarProduto(2L, "Produto B", 10, 5);
        estoque.adicionarProduto(3L, "Produto C", 15, 2);
        estoque.adicionarProduto(4L, "Produto D", 20, 2);


        estoque.exibirProduto();

        System.out.println("Valor total de estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade de valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

  
    
}
