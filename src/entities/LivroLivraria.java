package entities;

public class LivroLivraria {

	private String titulo, autor, genero;
	private Double preco;
	private Integer isbn;

	public LivroLivraria() {
	}

	public LivroLivraria(String titulo, String autor, Integer isbn, String genero, Double preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;

	}

	public String getTitulo () {
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	
	public String toString () {
		return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nGênero: " + genero + "\nPreço: " + String.format("R$ %.2f%n", preco);
	}

	
}
