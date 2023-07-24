package programa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Juliano", 41, 'M');
		Livro livro = new Livro("Senhos dos aneis", "JJ Martin", 452, pessoa);

		System.out.println(livro.toString());
		System.out.println(pessoa.toString());

		pessoa.fazerAniver();
	}

}
