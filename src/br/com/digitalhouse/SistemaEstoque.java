package br.com.digitalhouse;

import java.util.*;

public class SistemaEstoque {

    private List<Livro> livros =new ArrayList<>();
    private List<Colecao> colecaos = new ArrayList<>();

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro "+livro+ " cadastrado com sucesso!");
    }

    public void cadastrarColecao(Colecao colecao){
        colecaos.add(colecao);
        System.out.println("Coleção Cadastrada com Sucesso!");
    }

    public void ConsultarLivro(int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo){
                System.out.println(livros);
            }else{
                System.out.println("Livro não encontrado!");
            }
        }
    }

    public void efetuarVenda(int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo()==codigo){
                if (livro.getQuantidadeEmEstoque()>0){
                    livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque()-1);
                    System.out.println("Venda efetuada com sucesso!");
                }else{
                    System.out.println("Estoque esgotado!");
                }
            }
        }

    }

    public void efetuarVendaColecao(int codigo) {
        for (Colecao colecao : colecaos) {
            if (colecao.getCodigo()==codigo){
                colecaos.remove(colecao);
            }
        }

    }
}
