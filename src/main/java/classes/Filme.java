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
public class Filme {
    public String titulo;
    public String diretor;
    public double duracao;
    public double preco;
    
     public Filme() {
        this.titulo = "";
        this.diretor = "";
        this.duracao = 0;
        this.preco = 0;
     }
    public Filme(String titulo, String diretor, int duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public void copiar(Filme outro){
        this.titulo = outro.getTitulo();
        this.diretor = outro.getDiretor();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }    
    
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void fill(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe os dados do Filme: ");
        
        System.out.print("Titulo: ");
        this.titulo = ler.next();
        System.out.print("Diretor: ");
        this.diretor = ler.next();
        System.out.print("Duracao: ");
        this.duracao = ler.nextDouble();
         System.out.print("Preco: ");
        this.preco = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        String texto = "Titulo: " + this.titulo + "\n";
        texto += "Diretor: " + this.diretor + "\n";
        texto += "Preco: " + this.preco + "\n";
        texto += "Duracao: " + this.duracao + "\n";
        return texto;
    }
}
