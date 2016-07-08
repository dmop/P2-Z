package aplicacao;
import java.util.*;

public class Biblioteca {
	
	private ArrayList <LivroFisico> livros;
	private ArrayList <Usuario> usuarios;
	private ArrayList <LivroDigital> digital;
	//metodo construtor de biblioteca
	
	//alimentando biblioteca com usuarios
    Usuario u1 = new Usuario("login", "senha");
    Usuario u2 = new Usuario("123", "123");
    Usuario u3 = new Usuario("abra", "cadabra");

  //alimentando biblioteca com livros
    LivroFisico l1 = new LivroFisico(123,"Harry Potter","J. K. Rowling","Leya",124,550);
    LivroFisico l2 = new LivroFisico(321,"Guerra dos Tronos","George R. R. Martin","Leya",124,550);
    LivroDigital d1 = new LivroDigital(123,"Dança dos Dragões","J. K. Rowling","Leya",50);
    LivroDigital d2 = new LivroDigital(321,"Fogo sobre terra","George R. R. Martin","Leya",50);

    //metodo construtor
    public Biblioteca (){
        livros = new ArrayList<LivroFisico>();
        usuarios = new ArrayList<Usuario>();
        digital = new ArrayList<LivroDigital>();
        livros.add(l1);
        livros.add(l2);
        digital.add(d1);
        digital.add(d2);
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);

        }
    

    //Metodos livros fisicos
   
    //metodo de add livro
    public void botaLivroFisico(int isbn, String nome, String autor, String editora,double preco,int peso){
        LivroFisico livro = new LivroFisico(isbn, nome, autor, editora, preco, peso);
        livros.add(livro); 
        } 
    
    //metodo de remover Livro
    public void tiraLivroFisico(String nome){
        for (int i = 0; i < livros.size(); i++) {  
          if (livros.get(i).getnome().equals(nome))   
            livros.remove(i); 
          else System.out.println("Livro fisico não encontrado");
        	} 
        }
    
    
    //metodo de procurar livro por nome
    public void procuraLivroFisico(String nome){
        for (int i = 0; i < livros.size(); i++) {  
          if (livros.get(i).getnome().toLowerCase().equals(nome))   
            System.out.println("O livro"+livros.get(i).getnome()+" foi encontrado"); 
          else System.out.println("Livro fisico não encontrado");
        	} 
        }
 
    //Testa usuario existe
	public boolean usuarioExiste(String login,String senha){
        for (int i = 0; i < usuarios.size(); i++) {
        	if(usuarios.get(i).getlogin().equals(login) && usuarios.get(i).getsenha().equals(senha))
        		return true;
            }
        return false;

    }
	public String diminui(String nome){
		String x=nome.toLowerCase();
		return x;
	}
        
    

    //metodo de retornar lista com todos os livros
    public void listaLivrosFisico (){
        for (int i=0; i < livros.size();i++){
          System.out.println(livros.get(i).getnome());  
        }
    }
    
    //metodo retorna quantidade de livros
    public int qtdLivrosFisico(){
    	return livros.size();
    }
    
    public void imprimeListaFisico(){
    	System.out.print("Há um total de : ");
		System.out.println(livros.size()+" Livros Fisicos");
		System.out.println("E os livros fisicos são:");
		listaLivrosFisico();
    
    }
    
    //metodos livro digital
    //
    ///
    //
    ///
    //
    
    //metodo de add livro
    public void botaLivroDigital(int isbn, String nome, String autor, String editora, double preco){
        LivroDigital livro = new LivroDigital(isbn, nome, autor, editora, preco);
        digital.add(livro); 
        } 
    //metodo de remover Livro
    public void tiraLivroDigital(String nome){
        for (int i = 0; i < digital.size(); i++) {  
          if (digital.get(i).getnome().equals(nome))   
        	  digital.remove(i); 
          else System.out.println("Livro digital não encontrado");
        	} 
        }
    
    //metodo de procurar livro por nome
    public void procuraLivroDigital(String nome){
        for (int i = 0; i < digital.size(); i++) {  
          if (digital.get(i).getnome().toLowerCase().equals(nome)){
            System.out.println("O livro digital "+digital.get(i).getnome()+" foi encontrado"); 
          }
                    
          }
 
        
        
        }
    
   

    //metodo de retornar lista com todos os livros
    public void listaLivrosDigital (){
        for (int i=0; i < digital.size();i++){
          System.out.println(digital.get(i).getnome());  
        }
    }
    
    //metodo retorna quantidade de livros
    public void qtdLivrosDigital(){
    	System.out.print("Há um total de : ");
		System.out.println(digital.size()+"Livros digitais");
    }
    //metodo imprimir opcoes
    public static void imprime(){
    	System.out.println("");
        System.out.println("Digite sua escolha :");
        System.out.println("1- Adicionar Livro");
        System.out.println("2- Excluir Livro");
        System.out.println("3- Lista com todos os livros");
        System.out.println("4- Pesquisar Livro (pelo nome)");
        System.out.println("0- Sair");
        System.out.println("");    }
    
    public void imprimeListaDigital(){
    	System.out.print("Há um total de : ");
		System.out.println(digital.size()+" Livros digitais");
		System.out.println("E os livros digitais são:");
		listaLivrosDigital();
    
    }
    

}

