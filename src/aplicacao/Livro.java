package aplicacao;
public class Livro {
	protected int isbn;
	protected String nome;
	protected String autor;
	protected String editora;
	protected double preco;
	 
	//metodo construtor
	 public Livro(int isbn,String nome, String autor, String editora, double preco) {
		 	this.isbn = isbn;
		 	this.nome = nome;
	        this.autor = autor;
	        this.editora = editora;
	        this.preco=preco;
	        }
	    
	}
