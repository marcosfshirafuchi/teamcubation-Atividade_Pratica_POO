package Exercicio03;

import java.util.ArrayList;

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
public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();
    private ArrayList<Revista> listaRevistas = new ArrayList<>();
    private ArrayList<Object> listaItem = new ArrayList<>();
    private Livro livro = new Livro();
    private Revista revista = new Revista();

    public Biblioteca() {

    }

    public Biblioteca(Livro livro) {
        this.livro = livro;
    }

    public Biblioteca(Revista revista) {
        this.revista = revista;
    }

    public void adicionarItem(Object item) {
        this.listaItem.add(item);
    }

    public void adicionarLivro(Livro livro) {
        this.listaDeLivros.add(livro);
    }

    public void adicionarRevista(Revista revista) {
        this.listaRevistas.add(revista);
    }


    public void listarLivros() {
        for (Livro impressaoDeLivros : listaDeLivros) {
            impressaoDeLivros.exibirDetalhes();
        }
    }

    public void listarItens() {

        int contLivro = 0;
        int contRevista=0;
        for (int i = 0; i < listaItem.size(); i++) {
            //if (listaItem.get(i).equals(listaDeLivros.get(contLivro))) {
            if (listaItem.get(i).equals(listaDeLivros.get(contLivro))) {
                if (contLivro !=i){

                    listaDeLivros.get(contLivro).exibirDetalhes();
                    contLivro++;
                }else{
                    listaDeLivros.get(i).exibirDetalhes();
                    contLivro++;
                }
            }
            else {
                if (contRevista !=i) {
                    listaRevistas.get(contRevista).exibirDetalhes();
                    contRevista++;
                }else{
                    listaRevistas.get(i).exibirDetalhes();
                    contRevista++;
                }
            }
        }

    }

    public Livro buscarLivroPorTitulo(String titulo) {
        Livro livroEncontreado = new Livro();
        boolean resposta = false;
        for (int i = 0; i < listaDeLivros.size(); i++) {
            if (listaDeLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livroEncontreado = listaDeLivros.get(i);
                resposta = true;
            }
        }
        if (resposta) {
            return livroEncontreado;
        } else {
            return null;
        }
    }


}
