import java.util.Scanner;



	public class ProgramaEx2 {
		public static void main( String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantidades de pessoas que precisa cadastrar");
		int qtdCadastro = scan.nextInt();


		System.out.println("Digite nome para cadastrado1");
		String nomeCadastro1 = scan.next();

		System.out.println("Digite idade para cadastrado1");
		int idadeCadastro1 = scan.nextInt();

                System.out.println(nomeCadastro1 + " "+ idadeCadastro1);


		while(qtdCadastro ==2) {
			qtdCadastro++;
//			for(int i=0; i<qtdCadastro; i++) {

//			 System.out.println(qtdCadastro);

	                 System.out.println("Digite nome para cadastrado2");
           		 String nomeCadastro2 = scan.next();

         		 System.out.println("Digite idade para cadastrado2");
         		 int idadeCadastro2 = scan.nextInt();

//			 }
			System.out.println(nomeCadastro2 + " "+ idadeCadastro2);

		}
	
                        System.out.println("Fim de cadastro(s)");

	}


}
