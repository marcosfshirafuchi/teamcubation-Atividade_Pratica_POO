# <a href="https://ibb.co/3rNCHC2"><img src="https://i.ibb.co/K0qrHrd/1711738799650.jpg" alt="1711738799650" border="0" height="70" width="180"></a> Atividade Pratica POO


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)

# Exercícios - Atividade Pratica POO

## Exercício 1: Classes Básicas e Objetos
### Parte 1: Criação de Classes e Objetos
1.	Fácil: Crie uma classe Livro com os seguintes atributos:<br>
●	titulo (String)<br>
●	autor (String)<br>
●	anoPublicacao (int)<br><br>
2.	Médio: Adicione métodos na classe Livro:<br>
●	Um método exibirDetalhes() que imprime os detalhes do livro.<br><br>
3.	Difícil: Crie uma classe Biblioteca que armazena uma lista de livros e possui métodos para adicionar e listar os livros.<br>
●	Use um ArrayList<Livro> para armazenar os livros.<br>
●	Método adicionarLivro(Livro livro) para adicionar um livro à biblioteca.<br>
●	Método listarLivros() para listar todos os livros da biblioteca.<br><br>


## Exercício 2: Encapsulamento e Métodos
Parte 2: Encapsulamento<br>
1.	Fácil: Modifique a classe Livro para que seus atributos sejam privados e forneça métodos getter e setter para cada um deles.<br>
2.	Médio: Adicione validação nos setters, por exemplo, anoPublicacao não pode ser negativo.<br>
3.	Difícil: Na classe Biblioteca, crie um método buscarLivroPorTitulo(String titulo) que retorna o livro com o título especificado.<br>


## Exercício 3: Herança e Polimorfismo
Parte 3: Herança<br>
1.	Fácil: Crie uma classe Revista que herda da classe Livro e adicione um atributo edicao (int).<br>
2.	Médio: Sobrescreva o método exibirDetalhes() na classe Revista para incluir a edição da revista.<br>
3.	Difícil: Modifique a classe Biblioteca para que ela possa armazenar tanto livros quanto revistas. Utilize polimorfismo para listar os detalhes de cada item corretamente.<br>


## Exercício 4: Interfaces e Classes Abstratas
Parte 4: Interfaces e Classes Abstratas<br>
1.	Fácil: Crie uma interface ItemBiblioteca com o método exibirDetalhes().<br>
2.	Médio: Faça com que Livro e Revista implementem a interface ItemBiblioteca.<br>
3.	Difícil: Crie uma classe abstrata Item que implemente ItemBiblioteca e faça com que Livro e Revista herdem de Item. Adicione um método abstrato getTipo() na classe Item que retorna o tipo de item (livro ou revista).<br>

