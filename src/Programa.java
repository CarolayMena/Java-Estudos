import java.util.Scanner;

public class Programa {

	public static void main ( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Digite um numero: " );
		int input = scanner.nextInt();
		System.out.println( "O numero digitado foi: " + input);
		for ( int i=0; i<input; i++ ) {
			System.out.println( "Valor do input: " + (i + 1) );
		}
	}
}
