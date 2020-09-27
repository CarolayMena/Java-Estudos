package string;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsandoList {

	/*
	 * Pesquisa anônima
	 * Perguntar se quer digitar a nota ou sair
	 * Pega a nota e armazenar na lista
	 * Mostrar a lista quando escolhido sair
	 * Plus: mostra a nota média do professor
	 */
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Integer opcao = 0;
		double media = 0.0;
		int soma =0;
		int i =0;
		do {
		System.out.println(" --- Pesquisa de opinião dos alunos anônima --- ");

		System.out.println("Escolha uma opção: [1] Dar uma nota [2] Mostrar as notas [3] Mostrar a media [4] soma  [0] Sair");

		opcao = scanner.nextInt();
		if(opcao.equals(1)) {
			System.out.println("Digite a nota para o professor" );
			Integer nota = scanner.nextInt();
			lista.add(nota);

//			if (nota>=0) {
//				i++;
//				media = nota/i;
//			}
			soma += nota;
			for (i =0; i>= nota ;i++) {
				media = (double) (soma / i);
//				media = (double) nota/i;
			}

		} else if (opcao.equals(2)) {
			System.out.println(lista);
		} else if (opcao.equals(3)) {
			//implementar o calculo da media
			System.out.println("A media eh: " + media);
		}else if (opcao.equals(4)) {
			System.out.println("A soma eh: " + soma);
		}
	       	} while ( opcao != 0 );
		scanner.close();
	}

}
