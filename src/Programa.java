
public class Programa {

	public static void main ( String[] args ) {
		Pessoa[] pessoas = new Pessoa[2];

		pessoas[0]=new Pessoa("Jannet", 19);
	        pessoas[1]=new Pessoa("Andre", 34);

		for( int i=0; i<pessoas.length; i++ ) {
			System.out.println( pessoas[i].nome + " " + pessoas[i].idade );
		}

	}
}
