package br.com.digitalhouse;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Livro livro1 = new Livro(102, "matematica", "Jose Santos", 1990, 78828290,5,5.00);
        Livro livro2 = new Livro(103, "portugues", "Maria helena", 1990, 78983293,20,10.00);
        Livro livro3 = new Livro(104, "física", "Osmar Antunes", 1990, 78983292,30,15.00);
        Livro livro4 = new Livro(105, "historia", "Mario Claudio", 1990, 78988291, 23,25.00);

        List<Livro> livroList = new ArrayList<>();
        livroList.add(livro1);
        livroList.add(livro2);
        livroList.add(livro3);
        livroList.add(livro4);

        Colecao colecao = new Colecao(123,23.0D,"Exatas",livroList);


        System.out.println("Livraria: \n" +
                "Sistema de Cadastro de livraria\n" +
                "");










    }
}
