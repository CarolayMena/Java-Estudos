package string;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsandoMap {
	
	/*
	 * Pesquisa nominal (matricula + nota)
	 * Perguntar se quer digitar a nota ou sair
	 * Pega a nota e armazenar na lista
	 * Mostrar a lista quando escolhido sair nome mais a nota dada
	 * Plus: mostra a nota do professor
	 */
	
	public static void main(String[] args) {
		
		
		Map lista = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		Integer opcao = 0;
		double media = 0.0;
			
		do {
		System.out.println(" --- Pesquisa de opinião dos alunos anônima --- ");
		
		System.out.println("Escolha uma opção: [1] Dar uma nota [2] Mostrar as notas [3] Mostrar a media [0] Sair");
		
		opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			System.out.println("Digite a nota para o professor" );
			
			Integer nota= scanner.nextInt();
			Integer matricula = scanner.nextInt();
			
			
			lista.put(nota,matricula);
			
		} else if (opcao.equals(2)) {
			System.out.println(lista);
		} else if (opcao.equals(3)) {
			//implementar o calculo da media
			System.out.println("A media eh: " + media);
		}
		
		} while ( opcao != 0 );
		scanner.close();
		
	}
	
	}

