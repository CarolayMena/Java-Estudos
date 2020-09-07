import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("Jannet"));
	        pessoas.add(new Pessoa("Andre"));

		for( Pessoa p : pessoas ) {
			System.out.println(p.nome);
		}

	}
}
