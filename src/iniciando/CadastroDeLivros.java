package iniciando;

public class CadastroDeLivros {
	public static void main(String[] args) {
		// pag 67
		Livro livro = new Livro();
		livro.nome = "Java 8 prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		if(!livro.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.valor);
		}
		livro.isbn = "978-85-66250-46-6";
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-01";
		livro.autor = autor;
		livro.mostrarDetalhes();
		
		Autor autor2 = new Autor();
		autor2.nome = "Diego Fernandez";
		autor2.email = "diego.fernandez@caelum.com.br";
		autor2.cpf = "234.567.890-12";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.autor = autor2;
		outroLivro.mostrarDetalhes();
		
				
	}
}
