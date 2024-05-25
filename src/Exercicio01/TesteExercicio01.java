package Exercicio01;

import java.util.Scanner;

public class TesteExercicio01 {
    /**
     * <h1> Teamcubation - Atividade Pratica POO</h1>
     * Exercício 1: Classes Básicas e Objetos
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
        Biblioteca biblioteca = new Biblioteca();
        for(int i =1; i<=quantidadeDeLivro;i++){
            scanner.nextLine();
            System.out.printf("Digite o Titulo do %dº livro: ",i);
            String titulo = scanner.nextLine();
            System.out.printf("Digite o Autor do %dº livro: ",i);
            String autor = scanner.nextLine();
            System.out.printf("Digite o Ano do %dº livro: ",i);
            int ano = scanner.nextInt();
            Livro livro =new Livro(titulo,autor,ano);
            biblioteca.adicionarLivro(livro);
            System.out.println();
        }
        System.out.println("Impressão dos livros da biblioteca: ");
        biblioteca.listarLivros();
        scanner.close();
    }


}
