import java.util.Scanner;

public class Programa {

	public static void main ( String[] args ) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println( "Digite um numero: ");
//		int input = scanner.nextInt();
		int contador =0;
			while (contador <4){
				contador++;
//				System.out.println("valor do contador" + contador);

//				if(contador ==3) {
//					break;
//				}

				if(contador==2 || contador==4) {
				continue;
				}
			 System.out.println("valor do contador" + contador);

			}
	}
}
