package cursojava.orientacaoObjeto;

public abstract class Funcionario {
	private long cadastro;
	private String nome;
	private String ocupacao;
	private double salario;
	private static int numfuncionario;
	//Caso quisessemos 2 contrutores para não obrigar a TesteFuncionario a cadastrar logo o funcionário.
	public Funcionario() {
		this.numfuncionario++;
	}
	
	public Funcionario(long cadastro, String nome, String ocupacao, double salario) {
		this.cadastro = cadastro;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.salario = salario;
		this.numfuncionario++;
	}
	
	public long getcadastro() {
		return cadastro;
	}
	
	public void setcadastro(long cadastro) {
		this.cadastro = cadastro;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getocupacao() {
		return ocupacao;
	}
	
	public void setocupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	public double getsalario() {
		return salario;
	}
	
	public void setsalario(double salario) {
		this.salario = salario;
	}
	
	public static void vernumfuncionario() {
		System.out.println("Número de funcionários: " + numfuncionario);
	}
}
