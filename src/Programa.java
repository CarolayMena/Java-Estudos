import java.util.Scanner;

public class Programa {

	public static void main ( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		int input1=0;
		int input2=0;
		int menu=0;
		do {
			System.out.println("Escolha uma opcao 1-Soma 2-Subtracao 0-Sair");
			menu = scanner.nextInt();
			if (menu==1){
	                        System.out.println("Digite um numero1");
				input1 = scanner.nextInt();
				System.out.println("Digite um numero2");
				input2 = scanner.nextInt();
	                        System.out.println("soma " + (input1+input2));
		      	} else if (menu==2){
	                        System.out.println("Digite um numero1");
                                input1 = scanner.nextInt();
                                System.out.println("Digite um numero2");
                                input2 = scanner.nextInt();
                                System.out.println("subtracao" + (input1-input2));
                        }

		} while( menu!=0 );
	}
}
