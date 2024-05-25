package Exercicio04;
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

public class Livro extends Item implements ItemBiblioteca{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(){

    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo==""){
            System.out.println("O título não pode ser vazio!");
            return;
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor==""){
            System.out.println("O autor não pode ser vazio!");
            return;
        }
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao<0){
            System.out.println("O ano publicação não pode ser negativo!");
            return;
        }
        this.anoPublicacao = anoPublicacao;
    }
    @Override
    public void exibirDetalhes(){
        System.out.printf("Livro = Título: %s, Autor: %s e Ano: %d\n",titulo,autor,anoPublicacao);
    }


    @Override
    public Livro getTipo() {
        return this;
    }
}
