package org.example;

public class Produto {

   private String  nproduto;
   private int precounitario;


    public Produto(String nproduto, int precounitario) {
        this.nproduto = nproduto;
        this.precounitario = precounitario;
    }

    public String getNproduto() {
        return nproduto;
    }

    public void setNproduto(String nproduto) {
        this.nproduto = nproduto;
    }

    public int getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(int precounitario) {
        this.precounitario = precounitario;
    }
}
