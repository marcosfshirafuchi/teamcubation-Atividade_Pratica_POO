package Exercicio04;

import java.util.Scanner;

public class TesteExercicio04 {
    /**
     * <h1> Teamcubation - Atividade Pratica POO</h1>
     * Exercício 4: Interfaces e Classes Abstratas
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   25/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();
        System.out.println(livro.getTipo());
        Revista revista = new Revista();
        System.out.println(revista.getTipo());
        scanner.close();
    }
}
