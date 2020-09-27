package livroLivraria;

import java.util.Scanner;

public class AppLivroLivrariaArrayListStatic {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in); //usa buffer diferente só para fazer leitura de String
		
		int menu=0;
		double vInicial;
		double vFinal;
		
		//referencia para classe livraria
		LivroLivraria objLivro;
		
		String titulo;
		String autor;
		String genero;
		float preco;
		int isbn;
		
		do {
			exibirMenu();
			menu =entrada.nextInt();
			
			switch (menu) {
			case 1: //cadastro do livro
				System.out.println("Digite o titulo");
				titulo = entradaString.nextLine();
				
				System.out.println("Digite o autor");
				autor = entradaString.nextLine();
				
				System.out.println("Digite o genero");
				genero = entradaString.nextLine();
				
				System.out.println("Digite o ISBN");
				isbn = entrada.nextInt();
				
				System.out.println("Digite o preço");
				preco = entrada.nextFloat();

				//criar objeto da classe
				objLivro = new LivroLivraria(titulo,autor,isbn,genero,preco);
				
				//* guardar objeto(objLivro) na lista
				//como o arrayList dentro da classe acervo foi definido como statico, assim como todos os metodos tambem sao staticos
				//por esse motivo,nao é necessário criar uma estancia da classe
				//usamos o proprio nome da classe para acessar os metodos da classe
				Acervo.adicionar(objLivro);
							
				break;
				
			case 2:
				System.out.println("===>Listagem de livros");
				System.out.println(Acervo.listar());
				break;
				
			case 3:
				System.out.println("===>Exclusão de livros");
				System.out.println("Digite o titulo do livro");
				titulo = entradaString.nextLine();
				
				if (!(Acervo.getListaLivros().isEmpty())) { //valida se acervo nao está vazio, ou seja, verifica se existe dados
															// !--> equivale a not
															// assim pergunta se esta vazio--> Acervo.getListaLivros().isEmpty() 
					if(Acervo.remover(titulo)) {
						System.out.println("Livro removido com sucesso");
					}else {
						System.out.println("Titulo não encontrado");
					}
				}else {
					System.out.println("Não existe livros no acervo");
				}
				break;

			case 4:
				System.out.println("===>Pesquisar pelo genero");
				System.out.println("Digite o genero");
				genero =entradaString.nextLine();
				System.out.println("Existem :" +Acervo.pesquisar(genero)
				+ "Livro(s) do genero"+ genero);
				break;
				
			case 5:
				System.out.println("===>Pesquisar por faixa de preço");
				System.out.println("Digite a faixa inicial e a final");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				
				System.out.println("Existem :" + Acervo.pesquisar(vInicial, vFinal)
				+ "livro(s) com preço entre " + String.format("R$ %.2f \n e R$ %.2f \n", vInicial, vFinal));
				break;
				
			case 6:
				System.out.println("===>Total em  R$ de livros no Acervo");
				System.out.println("O total é: " +
				           String.format("R$ %2.f \n e R$ %.2f", Acervo.calcularTotalAcervo()));
				break;
			
			case 7:
				System.out.println("===>Saindo");
				break;

			default:
				System.out.println("Opçao do menu invalida");
				
			}
			
			
			
		}while(menu !=7);
	}

	//metodo opcoes do menu
	static void exibirMenu() {
		System.out.println("LIVRO LIVRARIA");
		System.out.println("1- CADASTRAR");
		System.out.println("2- LISTAR");
		System.out.println("3- EXCLUIR LIVRO");
		System.out.println("4- PESQUISAR POR GENERO");
		System.out.println("5- PESQUISAR POR FAIXA DE PRECO");
		System.out.println("6- CALCULAR TOTAL DO ACERVO");
		System.out.println("7- SAIR");
	}
}
