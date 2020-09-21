public class Funcionario {

        public String nome;
        public int idade;

	Funcionario() {
	}

	Funcionario (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}


	@Override
	public String toString(){
		return "Funcionario [nome=" + nome + ", idade=" + idade + "]";
	}



}
