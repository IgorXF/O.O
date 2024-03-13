/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author igor xisto
 */
public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int pag;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.preco = 0;
        this.pag = 0;
    }

    public Livro(String titulo, String autor, double preco, int pag) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.pag = pag;
    }

    public void copiar(Livro outro) {
        this.titulo = outro.getTitulo();
        this.autor = outro.getAutor();
        this.preco = outro.getPreco();
        this.pag = outro.getPag();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getPag() {
        return pag;
    }

    public void preencher() {
        //Cria o scanner
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe os dados do Livro");

        //Preenche cada um dos atributos
        System.out.print("Titulo:");
        this.titulo = ler.next();

        System.out.print("Autor:");
        this.autor = ler.next();

        System.out.print("Preco:");
        this.preco = ler.nextDouble();

        System.out.print("Paginas:");
        this.pag = ler.nextInt();
    }

    @Override
   public String toString(){
        String texto = "Titulo: "+ this.titulo + "\n";
        texto += "Autor: "+ this.autor + "\n";
        texto += "Paginas: "+ this.pag + "\n";
        texto += "Preco: " + this.preco + "\n"; 
        return texto;
    }

}

