package programa;

public class Pessoa {
	
	// Atributos
	private String nome;
	private int idade;
	private char sexo;
	
	
	// Contrutor
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	// Metodos
	public void fazerAniver() {
		this.idade ++;
		System.out.println("Parabéns pelo seu aniversário pelo seu " + this.getIdade());
	}
	
	
	// Getter & Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return sexo;
	}
	
	// ToString
	
	public String toString() {
		return "\nTeste";
	}
}

