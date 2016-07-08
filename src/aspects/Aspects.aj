package aspects;
import aplicacao.*;

public aspect Aspects {
	
    public void imprimir(){
    	System.out.println("");
        System.out.println("Digite sua escolha :");
        System.out.println("1- Adicionar Livro");
        System.out.println("2- Excluir Livro");
        System.out.println("3- Lista com todos os livros");
        System.out.println("4- Pesquisar Livro (pelo nome)");
        System.out.println("0- Sair");
        System.out.println("");
    }
    
    String around() : call (* Biblioteca.diminui()){
    	String s = proceed();
        return s.toLowerCase();
    }
    


	pointcut botaLivroDigital(): call (* Biblioteca.botaLivroDigital(..));	
	after() : botaLivroDigital(){
		System.out.println("Livro Digital Adicionado!");
	}
	
	pointcut botaLivroFisico(): call (* Biblioteca.botaLivroFisico(..));	
	after() : botaLivroFisico(){
		System.out.println("Livro Fisico Adicionado!");
	}
	
	
	//herança
	declare parents : LivroFisico extends Livro;
	declare parents : LivroDigital extends Livro;
	
	
	
	
	/*pointcut imprimeListaFisico(): call (* Biblioteca.imprimeListaFisico());	
	before() :  imprimeListaFisico(){
		qtdLivrosDigital();
	}*/
}

