package Exercicio02;

import java.util.Scanner;

public class TesteExercicio02 {
    /**
     * <h1> Teamcubation - Atividade Pratica POO</h1>
     * Exercício 2: Encapsulamento e Métodos
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   25/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de livros para cadastrar na biblioteca: ");
        int quantidadeDeLivro = scanner.nextInt();
        Livro livro = new Livro();
        int ano;
        String titulo = null;
        String autor = null;
        Biblioteca biblioteca = new Biblioteca();
        for (int i = 1; i <= quantidadeDeLivro; i++) {
            scanner.nextLine();
            do {
                System.out.printf("Digite o Titulo do %dº livro: ", i);
                titulo = scanner.nextLine();
                if (titulo=="") {
                    livro.setTitulo(titulo);
                }
            } while (titulo == "");

            do {
                System.out.printf("Digite o Autor do %dº livro: ", i);
                autor = scanner.nextLine();
                if(autor == ""){
                    livro.setAutor(autor);
                }
            } while (autor == "");

            do {
                System.out.printf("Digite o Ano do %dº livro: ", i);
                ano = scanner.nextInt();
                if (ano < 0) {
                    livro.setAnoPublicacao(ano);
                }
            } while (ano < 0);


            livro = new Livro(titulo, autor, ano);
            biblioteca.adicionarLivro(livro);
            System.out.println();
        }
        System.out.println("Impressão dos livros da biblioteca: ");
        biblioteca.listarLivros();
        System.out.println();
        scanner.nextLine();
        System.out.print("Digite o titulo do livro para pesquisa: ");
        String livroParaPesquisa = scanner.nextLine();
        System.out.println();
        System.out.println("Resultado da Busca do livro:");
        if (biblioteca.buscarLivroPorTitulo(livroParaPesquisa) == null) {
            System.out.println("Livro não encontrado na biblioteca!");
        } else {

            livro = new Livro(biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getTitulo(), biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getAutor(), biblioteca.buscarLivroPorTitulo(livroParaPesquisa).getAnoPublicacao());
            livro.exibirDetalhes();
        }
        scanner.close();
    }
}
