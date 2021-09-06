package cursojava.basico;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = soma(30,10);
		
		System.out.println(result);
		
		quadrado(8);
		
		String texto = mensagem();
		
		System.out.println(texto);
		
		olamundo();
	}
	
		static int soma(int a, int b) {
			return a+b;
		}
		
		static void quadrado(int numero) {
			System.out.println(numero*numero);
		}
		
		static String mensagem(){
			return "Mensagem do Sistema";
		}
		
		static void olamundo() {
			System.out.println("Olá Mundo!");
		}
}
