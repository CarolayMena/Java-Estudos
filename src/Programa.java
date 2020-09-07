import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("Jannet", 19));
	        pessoas.add(new Pessoa("Andre", 34));

		for( Pessoa p : pessoas ) {
			System.out.println(p.nome + " " + p.idade);
		}

	}
}
