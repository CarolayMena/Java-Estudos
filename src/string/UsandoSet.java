package string;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsandoSet {
	public static void main(String[] args) {
		
		/*
		 * Melhor avaliação anonima que o professor recebeu
		 * Conhecendo o professor de 0 a 100 qual nota você dá?
		 * Perguntar se quer digitar a nota ou sair
		 * Pega a nota e armazenar na lista
		 * Mostrar a lista quando escolhido sair
		 */
		
		
		Set<Integer> lista = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		Integer opcao = 0;
		Double media = 0.0;
			
		do {
		System.out.println(" --- Pesquisa de opinião dos alunos anônima --- ");
		
		System.out.println("Escolha uma opção: [1] Dar uma nota [2] Mostrar as notas [3] Mostrar a media [0] Sair");
		
		opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			System.out.println("Digite a nota para o professor" );
			
			Integer nota = scanner.nextInt();
			
			lista.add(nota);
		} else if (opcao.equals(2)) {
			System.out.println(lista);
		}
	
//		} else if (opcao.equals(3)) {
//			//implementar o calculo da media
//			System.out.println("A media eh: " + media);
//		}
		
		} while ( opcao != 0 );
		scanner.close();
		
	}
}

