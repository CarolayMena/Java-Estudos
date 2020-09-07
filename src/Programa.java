import java.util.List;
import java.util.ArrayList;



public class Programa {

	public static void main ( String[] args ) {
		List<Pessoa> pessoas = new ArrayList<>();

		Pessoa pessoa1 = new Pessoa("Janett");
		pessoa1.idade=19;
		Pessoa pessoa2 = new Pessoa("Andre");
		pessoa2.idade=34;
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);

//		pessoas.add(new Pessoa("Jannet", 19));
//	        pessoas.add(new Pessoa("Andre", 34));

		for( Pessoa p : pessoas ) {
			System.out.println(p.nome);
			System.out.println(p.idade);
		}

	}
}
