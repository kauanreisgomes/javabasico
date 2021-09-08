package cursojava.basico;

import java.util.Scanner;

public class Estruturadedecisao {

	public static void main(String[] args) {
			//Scanner para receber respostas
			Scanner r = new Scanner(System.in);
			
			System.out.println("Qual sua idade ?");
			
			int idade = r.nextInt();
			
			//if e else
				if(idade>=18) {
					System.out.println("Já pode tirar a CNH");
				}
				else {
					System.out.println("Você não pode tirar a CNH ;=;");
				}
		
			String semaforo;
			
			System.out.println("Qual a cor do semafóro?"); 
			
			semaforo= r.next();
			
				if(semaforo=="verde") {
					System.out.println("Siga em frente, o sinal está verde!");
				}
				else if(semaforo=="amarelo") {
					System.out.println("Tome cuidado, o sinal está quase fechando!");
				}
				else if(semaforo=="vermelho"){
					System.out.println("Não avance! O sinal está vermelho!");
				}
				else {
					System.out.println("O sinal tá quebrado...");
				}
			
			
			
			System.out.println("a- Cadastrar produto \n" + "b- Visualizar detalhes \n" + "c- Editar produto \n" + "d- Deletar produto"); 
			
			String opcao = r.next();
			
				switch(opcao){
				case "a" : 
					
					System.out.println("Cadastrar produto"); 
				
				break;
				
				case "b" : 
					
					System.out.println("Visualizar detalhes"); 
					
					break;
			
				case "c" : 
					
					System.out.println("Editar produto"); 
					
					break;
					
				case "d" : 
					
					System.out.println("Deletar produto"); 
					
					break;
					
				default : 
					
					System.out.println("Opção Inválida!"); 
					
					;
				}
		
		
	}

}
