package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Instanciar uma calsse.
        //Pessoa p1 = new Pessoa("Marta", 25);

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        Pessoa p1 = new Pessoa(nome, idade);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        Produto produto1 = new Produto("Arroz", 15);

        System.out.println("Nome do produto: " + produto1.getNproduto());
        System.out.println("Preço do produto: " + produto1.getPrecounitario());

    }
}