package br.com.digitalhouse;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colecao {

    private Integer codigo;
    private double preco;
    private String descricao;
    private List<Livro> listaDelivros = new ArrayList<>();

    public Colecao() {
    }

    public Colecao(Integer codigo, double preco, String descricao, List<Livro> listaDelivros) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
        this.listaDelivros = listaDelivros;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getListaDelivros() {
        return listaDelivros;
    }

    public void setListaDelivros(List<Livro> listaDelivros) {
        this.listaDelivros = listaDelivros;
    }

    @Override
    public String toString() {
        return "Colecao{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", listaDelivros=" + listaDelivros +
                '}';
    }
}