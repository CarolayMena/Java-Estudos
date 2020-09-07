import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa("Jannet");
		Pessoa pessoa2 = new Pessoa("Andre");
		pessoas.add(pessoa);
	        pessoas.add(pessoa2);
		for(Pessoa p : pessoas ) {
			System.out.println(p.nome);
		}
	}
}
