package org.example.atividade;

import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String nome = ler.next();

        System.out.println("Digite o Autor do livro: ");
        String autor = ler.next();

        System.out.println("Digite em qual pagina está: ");
        int numeropagina = ler.nextInt();

        System.out.println("Qual preço do livro: ");
        double preco = ler.nextDouble();

        Biblioteca livronew = new Biblioteca(nome, autor, numeropagina, preco);

        System.out.println("\nNome do livro: " + livronew.getNome());

        System.out.println("Nome do Autor: " + livronew.getAutor());

        System.out.println("Você esta na pagina: " + livronew.getNumeropagina());

        System.out.println("O livro custa R$:" + livronew.getPreco());

    }
}
