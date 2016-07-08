package aplicacao;

public class LivroFisico {
		private int peso;
		
	public LivroFisico(int isbn, String nome, String autor, String editora,double preco,int peso) {
		super(isbn, nome, autor, editora, preco);
		this.peso=peso;
		
	}
	
			// gets 
		 	public int getisbn(){
		        return isbn; }
		    public String getnome(){
		        return nome; }
		    public String getautor(){
		        return autor; }
		    public String geteditora(){
		        return editora; }
		    public double preco(){
		    	return preco;
		    }
		    public int peso(){
		    	return peso;
		    }
		    
		//sets
		    public void setisbn(int isbn){
		    	this.isbn=isbn; } 
		    public void setnome(String nome){
		    	this.nome=nome; }
		    public void setautor(String autor){ 
		    	this.autor=autor;} 
		    public void seteditora(String editora){
		    	this.editora=editora; }
		    public void setpreco(double preco){
		    	this.preco=preco;
		    }
		    public void setpeso(){
		    	this.preco=peso;
		    }
	

}
