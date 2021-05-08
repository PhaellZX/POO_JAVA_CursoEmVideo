package classes;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public Funcionario() {
		
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	public void mudarTrab() {
		this.setTrabalhando(this.getTrabalhando() != this.trabalhando);
	}
}
