import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<String>  nomes = new ArrayList<>();
		nomes.add("Janett");
	        nomes.add("Andre");
		nomes.remove("Janett");
		System.out.println(nomes);
	}
}
