/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
package com.mycompany.objecto;

import classes.Musica;
import entidade.GerenciadorMusicas;
import java.util.Scanner;


public class ObjectO {

    public static void main(String[] args) {
        GerenciadorMusicas gerenciador = new GerenciadorMusicas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Músicas:");
            System.out.println("1. Adicionar Música");
            System.out.println("2. Remover Música pelo Título");
            System.out.println("3. Pesquisar Música pelo Título");
            System.out.println("4. Pesquisar Música pelo Artista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Musica novaMusica = new Musica();
                    System.out.println("Preenchendo dados da nova música:");
                    novaMusica.fill();
                    gerenciador.addMusica(novaMusica);
                    break;
                case 2:
                    System.out.print("Digite o título da música para remover: ");
                    String tituloRemover = scanner.next();
                    gerenciador.deleteMusica(tituloRemover);
                    break;
                case 3:
                    System.out.print("Digite o título da música para pesquisar: ");
                    String tituloPesquisar = scanner.next();
                    Musica musicaPesquisada = gerenciador.buscaMusicaT(tituloPesquisar);
                    if (musicaPesquisada != null) {
                        System.out.println(musicaPesquisada.toString());
                    } else {
                        System.out.println("Música não encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do artista para pesquisar: ");
                    String artistaPesquisar = scanner.next();
                    Musica artistaPesquisado = gerenciador.buscaMusicaA(artistaPesquisar);
                    if (artistaPesquisado != null) {
                        System.out.println(artistaPesquisado.toString());
                    } else {
                        System.out.println("Artista não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objecto;

import classes.Filme;
import entidade.GerenciadorFilmes;
import java.util.Scanner;


public class ObjectO {

    public static void main(String[] args) {
        GerenciadorFilmes gerenciador = new GerenciadorFilmes();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Filmes:");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Remover Filme pelo Título");
            System.out.println("3. Pesquisar Filme pelo Título");
            System.out.println("4. Pesquisar Filme pelo Diretor");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Filme novoFilme = new Filme();
                    System.out.println("Preenchendo dados do novo Filme:");
                    novoFilme.fill();
                    gerenciador.addFilme(novoFilme);
                    break;
                case 2:
                    System.out.print("Digite o título do Filme para remover: ");
                    String tituloRemover = scanner.next();
                    gerenciador.deleteFilme(tituloRemover);
                    break;
                case 3:
                    System.out.print("Digite o título do Filme para pesquisar: ");
                    String tituloPesquisar = scanner.next();
                    Filme filmePesquisado = gerenciador.buscaFilmeT(tituloPesquisar);
                    if (filmePesquisado != null) {
                        System.out.println(filmePesquisado.toString());
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do Diretor para pesquisar: ");
                    String diretorPesquisar = scanner.next();
                    Filme diretorPesquisado = gerenciador.buscaFilmeD(diretorPesquisar);
                    if (diretorPesquisado != null) {
                        System.out.println(diretorPesquisado.toString());
                    } else {
                        System.out.println("Diretor não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}


