package com.ti2cc;

public class Livro {
	private int id;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Livro() {
		this.id = -1;
		this.titulo = "";
		this.autor = "";
		this.paginas = '*';
	}
	
	public Livro(int id, String titulo, String autor, int paginas) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getautor() {
		return autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}

	public int getpaginas() {
		return paginas;
	}

	public void setpaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
}
