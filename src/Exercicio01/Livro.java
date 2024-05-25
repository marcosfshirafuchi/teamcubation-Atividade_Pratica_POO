package Exercicio01;
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
public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(){

    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.printf("Título: %s, Autor: %s e Ano: %d\n",titulo,autor,anoPublicacao);
    }
}
