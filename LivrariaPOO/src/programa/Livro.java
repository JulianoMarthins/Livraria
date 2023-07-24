package programa;

public class Livro implements Publicacao {

	// Atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto = false;
	private Pessoa leitor;

	// Contrutor
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setLeitor(leitor);

	}

	// Metodos
	public void detalhes() {

	}

	// Metodos implementados publicação

	public void abrir() {
		this.setAberto(true);
	}

	public void fechar() {
		this.setAberto(false);
	}

	public void folhear() {
		this.setPaginaAtual(this.getPaginaAtual() + 1);
	}

	public void virarPagina() {
		if (this.getPaginaAtual() < this.getTotalPaginas()) {
			this.setPaginaAtual(this.getPaginaAtual() + 1);
		}
		else {
			System.out.println("O livro acabou");
		}
	}

	public void voltarPagina() {
		if (this.getPaginaAtual() > 0) {
			this.setPaginaAtual(this.getPaginaAtual() - 1);
		}
		else {
			System.out.println("Você está no inicio do livro");
		}
	} 
	
	

	// Getters & Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	// ToString
	public String toString() {
		return "Livro:\n\nTitulo -> " + this.getTitulo() + "\nAutor -> " + this.getAutor() + "\nTotal de Paginas -> "
				+ this.getTotalPaginas() + "\nPagina atual -> " + this.getPaginaAtual() + "\nAberto -> "
				+ this.getAberto() + "\nLeitor: " + this.getLeitor();

	}

}
