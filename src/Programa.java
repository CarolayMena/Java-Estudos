import java.util.Scanner;

public class Programa {

	public static void main ( String[] args ) {
		try {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Digite um número");
			int numero = scanner.nextInt();
			System.out.println("Digite o denominador");
			int denominador = scanner.nextInt();
			System.out.println(numero/denominador);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro");
	 	}
	}
}
