public class Pessoa {

	Pessoa(){
	}

	Pessoa(String nome){
		this.nome = nome;
	}

	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String nome;
	public int idade;
}
