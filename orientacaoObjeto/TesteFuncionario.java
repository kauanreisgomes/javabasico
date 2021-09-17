package cursojava.orientacaoObjeto;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		FuncionarioOperacional f1 = new FuncionarioOperacional(1145,"Jhon","RH",4000,"Pessoas");
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		System.out.println("Cadastro: " + f1.getcadastro() + 
							"\nNome: " + f1.getnome() + 
							"\nOcupação: " + f1.getocupacao() + 
							"\nSalario: " + f1.getsalario() + 
							"\nSetor: " + f1.getsetor());
		
		Funcionario.vernumfuncionario();

	}

}
