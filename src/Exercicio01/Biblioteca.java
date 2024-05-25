package Exercicio01;

import java.util.ArrayList;
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
public class Biblioteca {
    public ArrayList<Livro> listaDeLivros = new ArrayList<>();


    public void adicionarLivro(Livro livro){
       this.listaDeLivros.add(livro);
    }

    public void listarLivros(){
        for (Livro impressaoDeLivros : listaDeLivros){
            impressaoDeLivros.exibirDetalhes();
        }
    }
}
