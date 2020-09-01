import java.util.Scanner;

	public class ProgramaLer {
		public static void main ( String[] args) {

		try  {


			System.out.println("Digite objeto e cor");	

			Scanner ler = new Scanner(System.in);

			String  nomeObjetoComposto = ler.nextLine();
			
			System.out.println("Digite objeto");
			String nomeObjetoSimples = ler.nextLine();

		     } catch (Exception e) {
			System.out.println("Erro ao executar");
		}	
	}


}
