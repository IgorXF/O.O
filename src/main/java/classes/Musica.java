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
public class Musica {
    private String titulo;
    private String artista;
    private double preco;
    public double duracao;

    public Musica(String titulo, String artista, double preco, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.preco = preco;
        this.duracao = duracao;
    }
    
    public Musica() {
        this.titulo = "";
        this.artista = "";
        this.preco = 0;
        this.duracao = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public void copiar(Musica outra){
        this.artista = outra.getTitulo();
        this.artista = outra.getArtista();
        this.preco = outra.getPreco();
        this.duracao = getDuracao();
    }
    
    public void fill(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Preencher dados da musica: ");
        
        System.out.print("Titulo: ");
        this.titulo = ler.next();
        System.out.print("Artista: ");
        this.artista = ler.next();
        System.out.print("Preco: ");
        this.preco = ler.nextDouble();
        System.out.print("Duracao: ");
        this.duracao = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        String texto = "Titulo: " + this.titulo + "\n";
        texto += "Artista: " + this.artista + "\n";
        texto += "Preco: " + this.preco + "\n";
        texto += "Duracao: " + this.duracao + "\n";
        return texto;
    }
    
}
