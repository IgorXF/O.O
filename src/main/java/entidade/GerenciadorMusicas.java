/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor xisto
 */
public class GerenciadorMusicas {
    private List<Musica> musica;
    
    public GerenciadorMusicas(){
        this.musica = new ArrayList<>();
    }
    
    public void addMusica(Musica novaMusica){
        musica.add(novaMusica);
        System.out.println(" A Musica foi adicionada!");
    }
    
    public void deleteMusica(String titulo){
        this.musica.removeIf(musica -> musica.getTitulo().equals(titulo));
        /**       int idx = 0;
        for(Musica removido : musica){
            if(removido.titulo.equals(titulo)){
                musica.remove(idx);
            }else{
                idx++;
             }   
        }
        */
        System.out.println(" A Musica foi removida!");
    }
    
    public Musica buscaMusicaT(String titulo){
        for(Musica musicap : musica){
            if(musicap.getTitulo().equals(titulo)){
                return musicap;
            }
        }
        return null;
    }
    
    public Musica buscaMusicaA(String artista){
        for(Musica musicap : musica){
            if(musicap.getArtista().equals(artista)){
                return musicap;
            }
        }
        return null;
    }
    
}
