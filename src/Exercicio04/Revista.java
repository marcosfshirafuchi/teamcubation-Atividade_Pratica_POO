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

public class Revista extends Item implements ItemBiblioteca{
    private int edicao;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    public Revista(){

    }
    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if(edicao<0){
            System.out.println("O numero da edição não pode ser negativo!");
            return;
        }
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Revista = Título: %s, Autor: %s, Ano: %d e Edição: %dª \n",this.titulo,this.autor,this.anoPublicacao, this.edicao);
    }

    @Override
    public Revista getTipo() {
        return this;
    }
}
