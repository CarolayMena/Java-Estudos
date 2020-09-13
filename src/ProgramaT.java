import java.util.List;
import java.util.ArrayList;

public class ProgramaT {
	public static void main (String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		Funcionario fun = new Funcionario("Carolay", 36);
                Funcionario fun2 = new Funcionario("Mena", 46);
		lista.add(new Funcionario("Janett", 36));
		lista.add(fun);
		lista.add(fun2);
		for (int i=0; i<lista.size() ; i++ ) {
			 System.out.println(lista.get(i).nome + " " + lista.get(i).idade);
		}

	}
}

