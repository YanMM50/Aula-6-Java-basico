package org.example.atividade;

public class Biblioteca {
    private String nome;
    private String autor;
    private int numeropagina;
    private double preco;


    public Biblioteca(String nome, String autor, int numeropagina, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.numeropagina = numeropagina;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropagina() {
        return numeropagina;
    }

    public void setNumeropagina(int numeropagina) {
        this.numeropagina = numeropagina;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


