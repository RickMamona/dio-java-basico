package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosporAutor = new ArrayList<>();
        if(!livroList.isEmpty()){    
            for(Livro l: livroList){
                if(l.getAutor().equals(autor)){
                    livrosporAutor.add(l);
                }
            }
        }
        return livrosporAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosporAno = new ArrayList<>();
        if(!livroList.isEmpty()){    
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosporAno.add(l);
                }
            }
        }
        return livrosporAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){    
            for(Livro l: livroList){
                if(l.getTitulo().equals(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 1994);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5", 2010);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}