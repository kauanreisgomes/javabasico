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
					System.out.println("J� pode tirar a CNH");
				}
				else {
					System.out.println("Voc� n�o pode tirar a CNH ;=;");
				}
		
			String semaforo;
			
			System.out.println("Qual a cor do semaf�ro?"); 
			
			semaforo= r.next();
			
				if(semaforo=="verde") {
					System.out.println("Siga em frente, o sinal est� verde!");
				}
				else if(semaforo=="amarelo") {
					System.out.println("Tome cuidado, o sinal est� quase fechando!");
				}
				else if(semaforo=="vermelho"){
					System.out.println("N�o avance! O sinal est� vermelho!");
				}
				else {
					System.out.println("O sinal t� quebrado...");
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
					
					System.out.println("Op��o Inv�lida!"); 
					
					;
				}
		
		
	}

}
