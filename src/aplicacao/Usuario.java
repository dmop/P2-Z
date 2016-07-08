package aplicacao;

public class Usuario extends Pessoa{

	//metodo construtor
public Usuario(String login, String senha) {
		super(login, senha);
	}



// gets 
public String getlogin(){
	return login; }
public String getsenha(){
    return senha; }
//sets
public void setlogin(String login){
	this.login=login; } 
public void setsenha(String senha){
	this.senha=senha; }

}