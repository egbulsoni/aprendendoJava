package iniciando;

public class MeuPrimeiroPrograma {
	public static void main(String[] args) {
		System.out.println("O primeiro de muitos!");
		
		Livro livro = new Livro();
		livro.nome = "Java 8 prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		System.out.println("valor atual: " + livro.valor);
		livro.valor -= livro.valor * 0.1;
		System.out.println("valor com desconto: " + livro.valor);
		livro.isbn = "978-85-66250-46-6";
		
		livro.mostrarDetalhes();
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
	}

}
