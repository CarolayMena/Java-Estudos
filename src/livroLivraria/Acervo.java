package livroLivraria;

import java.util.ArrayList;

public class Acervo {
	
	//arraylist statico para que no momento que os metodos forem chamados da classe acervo, não precisa criar objeto da classe acervo
	//é uma lista única dentro da aplicaçao
	
	private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	public static ArrayList<LivroLivraria> getListaLivros() {
		return listaLivros;
	}
	
	//adiciona objeto na lista --recebe objeto do tipo livroLivraria
	static public void adicionar(LivroLivraria l) {
		 listaLivros.add(l); //acessa listaLivros chamando metodo add pasando objeto l
	}
	
	//lista os dados de todos os objetos da lista
	//metodo statico que retorna uma string que contem a concatenaçao do imprimir de cada objeto da lista
	static public String listar() {
		String saida = "";
		int i =1;
		for (LivroLivraria l : listaLivros ) {
			saida += "\n Livro numero" + (i++) ;
		}
		return saida;
	}
	
	//metodo para pesquisar quantos livros existem dentro do acervo por um determinado genero
	//metodo statico que retorna um inteiro chamado pesquisar que recebe uma string que é o genero
	static public int pesquisar(String genero) {
		int qtd =0;  //contador de genero
		
		for (LivroLivraria l : listaLivros) {
			if(l.getGenero().equalsIgnoreCase(genero)) { //equalsIgnoreCase serve para comparar string sem importar se é maiscula ou minuscula
				qtd++;                                   //compara genero da lista com o parametro genero do metodo pesquisar
			}											 // se for igual, adiciona 1 no contador
		}
		return qtd;
	}
	
	
	//**************sobrecarga de metodo pesquisar *********************
	//metodo pesquisar por faixa de preço
	//pesquisar vai retornar um inteiro , vai receber 2 valores double--> valor inicial e final da faixa
	//itera sobre a coleçao buscando no get preco do objeto e verificar se esta entre a faixa inicial e final
	static public int pesquisar(double vInicial, double vFinal) {
		int qtd =0;
		for ( LivroLivraria l : listaLivros) {
			if(l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
				qtd++;
			}
		}
		return qtd;
	}
	
	//metodo remover livro pelo titulo
	// boolean retorna se removou ou nao o objeto com sucesso
	static public boolean remover (String titulo) {
		for (LivroLivraria l : listaLivros) {
			if(l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;
	}
	
	//metodo calcula total do acervo de livros
	static double calcularTotalAcervo() {
		double total =0;
		
		for(LivroLivraria l : listaLivros) { //cada objeto da lista percorrido acumula o valor do preço na variavel total
			total += l.getPreco();
		}
		return total;
	}
	
	
}
