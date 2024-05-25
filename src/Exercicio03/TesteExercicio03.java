package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicio03 {
    public static void main(String[] args) {
        /**
         * <h1> Teamcubation - Atividade Pratica POO</h1>
         * Exercício 3: Herança e Polimorfismo
         * <p>
         * <b>Note:</b> Desenvolvido na linguagem Java.
         *
         * @author  Marcos Ferreira Shirafuchi
         * @version 1.0
         * @since   25/05/2024
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de livros para cadastrar na biblioteca: ");
        int quantidadeDeLivro = scanner.nextInt();
        Livro livro = new Livro();
        int ano;
        String titulo = null;
        String autor = null;
        int edicao;
        Biblioteca biblioteca = new Biblioteca();
        Revista revista = new Revista();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Revista> revistas = new ArrayList<>();
        for (int i = 1; i <= quantidadeDeLivro; i++) {
            System.out.println();
            System.out.println("Digite o item para cadastrar: ");
            System.out.println("L = Livro");
            System.out.println("R = Revista");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            char opcao = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            do {
                System.out.printf("Digite o Titulo do %dº item: ", i);
                titulo = scanner.nextLine();
                if (titulo=="") {
                    livro.setTitulo(titulo);
                }
            } while (titulo == "");

            do {
                System.out.printf("Digite o Autor do %dº item: ", i);
                autor = scanner.nextLine();
                if(autor == ""){
                    livro.setAutor(autor);
                }
            } while (autor == "");

            do {
                System.out.printf("Digite o Ano do %dº item: ", i);
                ano = scanner.nextInt();
                if (ano < 0) {
                    livro.setAnoPublicacao(ano);
                }
            } while (ano < 0);

            if (opcao =='L'){
                livro = new Livro(titulo, autor, ano);
                biblioteca.adicionarLivro(livro);
                biblioteca.adicionarItem(livro);
            } else if (opcao=='R') {
                System.out.print("Digite a edição da Revista: ");
                edicao = scanner.nextInt();
                revista = new Revista(titulo, autor, ano,edicao);
                revistas.add(revista);
                biblioteca.adicionarRevista(revista);
                biblioteca.adicionarItem(revista);
            }

            System.out.println();
        }
        System.out.println("Impressão dos items da biblioteca: ");
        biblioteca.listarItens();
        System.out.println();
        scanner.nextLine();
        System.out.print("Digite o titulo do livro para pesquisa: ");
        String livroParaPesquisa = scanner.nextLine();
        System.out.println();
        System.out.println("Resultado da Busca do livro:");
        if (biblioteca.buscarLivroPorTitulo(livroParaPesquisa)==null){
            System.out.println("Livro não encontrado na biblioteca!");
        }else{

            livro = new Livro(biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getTitulo(),biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getAutor(),biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getAnoPublicacao());
            livro.exibirDetalhes();
        }
        scanner.close();
    }
}
