/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import classes.Filme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor xisto
 */
public class GerenciadorFilmes {
    private List<Filme> filme;
    
    public GerenciadorFilmes(){
        this.filme = new ArrayList<>();
    }
    
    public void addFilme(Filme novoFilme){
        filme.add(novoFilme);
        System.out.println(" O filme foi adicionado!");
    }
    
    public void deleteFilme(String titulo){
        this.filme.removeIf(filme -> filme.getTitulo().equals(titulo));
        /**       int idx = 0;
        for(Musica removido : musica){
            if(removido.titulo.equals(titulo)){
                musica.remove(idx);
            }else{
                idx++;
             }   
        }
        */
        System.out.println("O Filme foi removido!");
    }
    
    public Filme buscaFilmeT(String titulo){
        for(Filme filmep : filme){
            if(filmep.getTitulo().equals(titulo)){
                return filmep;
            }
        }
        return null;
    }
    
    public Filme buscaFilmeD(String diretor){
        for(Filme filmep : filme){
            if(filmep.getDiretor().equals(diretor)){
                return filmep;
            }
        }
        return null;
    }
}
