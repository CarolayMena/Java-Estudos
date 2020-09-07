import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("Jannet", 19));
	        pessoas.add(new Pessoa("Andre", 34));

		for( int i=0; i<2; i++ ) {
			System.out.println( pessoas.get(i).nome + " " + pessoas.get(i).idade );
		}

	}
}
