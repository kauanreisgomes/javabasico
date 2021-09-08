package cursojava.basico;

import java.util.Scanner;

public class EstruturadeRepeticao {

	public static void main(String[] args) {
		 boolean flag= true;
		
		Scanner leitor= new Scanner(System.in);
		
		while(flag) {
			
			System.out.println("True"); 
			flag= leitor.nextBoolean();
			
			
			
		}
		
		int contador= 0;
		
		while(contador<10) {
			System.out.println(contador++);
			
			
		}
		//Do while
		do {
			System.out.println("Testando o Do-While");
		}while(false);
		
		
		
		for(int x=0; x>=10; x++) {
			System.out.println("Número: " + x);
		}
		
		
		String frutas[] = {"Maça", "Banana", "Uva","Abacati"};
		
		for(int x=0; x<4; x++) {
			System.out.println("Fruta: " + frutas[x] + "\n No vetor: " + x);
		}
		
		int x=0;
		for(String fruta : frutas) {
		
			System.out.println("Fruta: " + fruta + "\n Camada: " + x++);
		}
	}

}
