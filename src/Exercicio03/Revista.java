package Exercicio03;
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
public class Revista extends Livro{
    private int edicao;

    public Revista(){

    }
    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
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

    public void exibirDetalhes(){
        System.out.printf("Revista = Título: %s, Autor: %s, Ano: %d e Edição: %dª \n",getTitulo(),getAutor(),getAnoPublicacao(), this.edicao);
    }
}
