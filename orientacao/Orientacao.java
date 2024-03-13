/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package orientacao;

import classes.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author igor xisto
 */
public class Orientacao {

    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("1 - Inserir livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Pesquisar livro (titulo)");
        System.out.println("4 - Pesquisar livro (autor)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        List<Livro> listaLivros;
        listaLivros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
        do {
            opcao = imprimeMenu();
            switch (opcao) {
                case 1 -> {
                    //
                    Livro l1 = new Livro();
                    l1.preencher();
                    listaLivros.add(l1);
                }
                case 2 ->                     {
                        //remocao
                        System.out.println("Informe o titulo:");
                        String title = leitor.nextLine();
                        for (int i = 0; i <= listaLivros.size() - 1; i++) {
                            Livro li = listaLivros.get(i);
                            if (title.equals(li.getTitulo())) {
                                System.out.println("Livro encontrado");
                                listaLivros.remove(li);
                            }
                        }                          }
                case 3 ->                     {
                        //pesquisa titulo
                        System.out.println("Informe o titulo:");
                        String title = leitor.nextLine();
                        for (int i = 0; i <= listaLivros.size() - 1; i++) {
                            Livro li = listaLivros.get(i);
                            if (title.equals(li.getTitulo())) {
                                System.out.println("Livro encontrado");
                                System.out.println( li.toString());
                            }
                        }                          }
                case 4 -> {
                    //pesquisa autor
                    System.out.println("Informe o autor:");
                    String autor = leitor.nextLine();
                    for (int i = 0; i <= listaLivros.size() - 1; i++) {
                        Livro li = listaLivros.get(i);
                        if (autor.equals(li.getAutor())) {
                            System.out.println("Autor encontrado");
                            System.out.println( li.toString());
                        }
                    }
                }
                default -> {
                }
            }
        } while (opcao != 0);
    }
}

