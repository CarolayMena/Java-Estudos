import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<String>  nomes = new ArrayList<>();
		nomes.add("Janett");
	        nomes.add("Andre");
		for(String nome : nomes ) {
			System.out.println(nome);
		}
	}
}
