package Exercicio02;

import java.util.ArrayList;
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

    public Livro buscarLivroPorTitulo(String titulo){
        Livro livroEncontreado = new Livro();
        boolean resposta = false;
        for (int i=0; i<listaDeLivros.size(); i++){
            if(listaDeLivros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                 livroEncontreado = listaDeLivros.get(i);
                resposta = true;
            }
        }
        if (resposta){
            return  livroEncontreado;
        }else{
            return null;
        }
    }
}
