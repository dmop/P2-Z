package aplicacao;

import java.util.*;
public class Main {
	static Biblioteca b1 = new Biblioteca();

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			boolean inicio=true;
			
			//while para tela de login
			while (inicio){
				 System.out.println("BEM VINDO!\n");
		         System.out.println("1- Acessar biblioteca");
		         System.out.println("2- Sair do programa");
		         
		         int opcao=in.nextInt();
		         switch(opcao){
		         	case 1:
		         		Boolean rodano = true;
		    			//sistema propriamente dito
		    			while (rodano){
    					in.nextLine();
		    		    System.out.println("Digite seu login :");
						String login1=in.nextLine();
		    		    System.out.println("Digite sua senha :");
						String senha1=in.nextLine();
						
						if(b1.usuarioExiste(login1,senha1)==true){
							Boolean rodando = true;
			    			//sistema propriamente dito
			    			while (rodando){
			    				 b1.imprime();
			    		         int resposta = in.nextInt();
			    		         switch(resposta){
			    		         	case 0:
			    		         		System.out.println("Alterações salvas!"+"\n"+"Até a próxima!\n" );
			    		         		rodando=false;
			    						break;
			    					case 1:
			    						System.out.println("1 - Livro digital");
			    						System.out.println("2 - Livro fisico");
			    				 		int e1=in.nextInt();
			   				 			if(e1==1){
			    				 			System.out.println("ISBN do livro");
				    						int l1=in.nextInt();
				    						in.nextLine();
				    						System.out.println("Nome do livro");
				    						String l2=in.nextLine();
				    						System.out.println("Autor do livro");
				    						String l3=in.nextLine();
				    						System.out.println("Editora do livro");
				    						String l4=in.nextLine();
				    						System.out.println("Preço do livro");
				    						double l5=in.nextDouble();
				    						b1.botaLivroDigital(l1, l2, l3, l4,l5);
				    						break;
				    						
			    				 		}
			    				 			if(e1==2){			    						
					    						System.out.println("ISBN do livro");
					    						int l1=in.nextInt();
					    						in.nextLine();
					    						System.out.println("Nome do livro");
					    						String l2=in.nextLine();
					    						System.out.println("Autor do livro");
					    						String l3=in.nextLine();
					    						System.out.println("Editora do livro");
					    						String l4=in.nextLine();
					    						System.out.println("Preço do livro");
					    						double l5=in.nextDouble();
					    						System.out.println("Peso do livro(Em gramas)");
					    						int l6=in.nextInt();
					    						b1.botaLivroFisico(l1, l2, l3, l4,l5,l6);
					    						break;}
			    				 		else{
			    				 			System.out.println("Opção invalida");
			    				 			break;
			    				 		}
			    				 			
			    				 		
			    		             		         	
			    					case 2:
			    						System.out.println("1 - Livro digital");
			    						System.out.println("2 - Livro fisico");
			    				 		int e2=in.nextInt();
			    				 		if(e2==1){
						    				in.nextLine();
						    				System.out.println("Digite nome do livro");
						    				String d2=in.nextLine();
						    				b1.tiraLivroDigital(d2);
						    				System.out.println("Livro Retirado");
						    				break;
			    				 		}
						    				if(e2==2){
						    					in.nextLine();
					    						System.out.println("Digite nome do livro");
					    						String d3=in.nextLine();
					    						b1.tiraLivroFisico(d3);
					    						System.out.println("Livro Retirado");
					    						break;
						    				}
						    				else{
						    					System.out.println("Numero invalido");
						    					break;
						    				}
						    				
			    				 			

			    					case 3:
			    						b1.imprimeListaFisico();
			    						System.out.println("");
			    						b1.imprimeListaDigital();
			    						break;
			    						
			    					case 4:
			    						System.out.println("1 - Livro digital");
			    						System.out.println("2 - Livro fisico");
			    				 		int e3=in.nextInt();
			    				 		if(e3==1){
			    				 			in.nextLine();
			    				 			System.out.println("Digite nome do livro");
			    				 			String r1=in.nextLine();
			    				 			String r = b1.diminui(r1);
			    				 			b1.procuraLivroDigital(r);
			    				 			break;
			    						}
			    				 		if(e3==2){
			    				 			in.nextLine();
				    						System.out.println("Digite nome do livro");
				    						String r1=in.nextLine();
			    				 			String r = b1.diminui(r1);
				    						b1.procuraLivroFisico(r);
				    						break;
			    				 		}
			    				 		else{
					    					System.out.println("Numero invalido");
					    					break;
					    				}
			    						

			    					default:
			    						System.out.println("Opção inválida");
			    						break;
			    		         }
			    		         
			    			}
						}
						else{
							System.out.println("Senha incorreta");
							System.out.println("Tecle ENTER para tentar de novo");
							break;
							
						}		
	    		
						
		    		
						break;
		    		
		    		}	
											
					//fim do programa
					case 2:
						System.out.println("Encerrando...");
						System.exit(0);
					default:
    						System.out.println("Opção inválida");
    						System.out.println("");
    						break;
    												
		         		}
		         
						}

	}

}
