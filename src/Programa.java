import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Programa {

	public static void main ( String[] args ) {
		int tamanho =0;	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da lista");
		tamanho = scanner.nextInt();

		Funcionario func = new Funcionario();

		Map lista = new HashMap<>();
		for (int i=0; i<tamanho; i++) { 
			lista.put(i,func);
		}
		System.out.println(lista);
	}
}
