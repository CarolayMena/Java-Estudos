package livroLivraria;

public class LivroLivraria {
	
	private String titulo;
	private String autor;
	private int isbn;
	private String genero;
	private float preco;
	
	//construtor default
	public LivroLivraria() {} 

	//construtor sobrecarregado
	public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;
	}
	
	
	//metodo de impressao de todos os atributos da classe --(parecido a metodo toString)
	public String imprimir() {
		return "Titulo:" + titulo + "\n autor" + autor + "\n isbn" + isbn + "\n genero" + genero +
				String.format("\n Preço R$ %.2f" ,preco);
	}
	
		
	//métodos de acesso dos atributos
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
	

}
