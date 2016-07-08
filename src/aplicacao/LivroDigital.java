package aplicacao;

public class LivroDigital  {

	public LivroDigital(int isbn, String nome, String autor, String editora, double preco) {
		super(isbn, nome, autor, editora, preco);
		// TODO Auto-generated constructor stub
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


}
