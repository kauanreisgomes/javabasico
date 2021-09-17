package cursojava.orientacaoObjeto;

public class FuncionarioOperacional extends Funcionario implements Gratificacao, Descontos {

	private String setor;
	
	FuncionarioOperacional(){
		super();
	}
	
	public FuncionarioOperacional(long cadastro, String nome, String ocupacao, double salario, String setor) {
		super(cadastro, nome, ocupacao, salario);
		
		this.setor = setor;
		
	}
	
	public String getsetor() {
		return setor;
	}
	public void setsetor(String setor) {
		this.setor = setor;
	}

	@Override
	public double participacaolucro() {
		
		return this.getsalario() * 1.5;
	}

	@Override
	public double auxilioCreche() {
		
		return 200;
	}

	@Override
	public double auxilioViaje() {

		return 0;
	}

	@Override
	public double FGTS() {
		
		return this.getsalario() * 0.09;
	}

	@Override
	public double ValeAlimentacao() {
		
		return this.getsalario() * 0.05;
	}

	@Override
	public double ValeTransporte() {
		
		return this.getsalario() * 0.06;
	}

}
