package cursojava.basico;
/*
 * 
 * Classe que imprime um texto no console.
 * 
 * vers�o 1.0
 * 
 */
import java.util.Scanner;
public class OlaMundo {

	public static void main(String[] args) {
		//
		System.out.println("Seja bem vindo ao curso de l�gica de programa��o JAVA");
		
		/*Scanner res = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = res.nextLine();
		System.out.println("Digite seu endere�o:");
		String End= res.nextLine();
		System.out.println("Digite seu cep");
		String cep= res.nextLine();
		System.out.println("Digite seu numero:");
		String num= res.nextLine();
		
		System.out.printf("Nome: %s \n Endere�o: %s \n Cep: %s Numero: %s", nome, End, cep, num);
		*/
		System.out.printf("1 � Tenha um sono regular.\n"
				+ "2 � Pratique exerc�cios.\r\n"
				+ "3 � Separe algumas horas do seu dia para o estudo.\r\n"
				+ "4 � Aplique o m�todo POMODORO.\r\n"
				+ "5 � Desenvolva projetos.\r\n"
				+ "");
	}

}
