package classes;

public class Tecnico extends Aluno {
	private String registrarProfissao;
	
	public void praticar() {
		System.out.println(this.getNome() + " � um " + this.getRegistrarProfissao() + " e est� trabalhando...");
	}

	public String getRegistrarProfissao() {
		return registrarProfissao;
	}

	public void setRegistrarProfissao(String registrarProfissao) {
		this.registrarProfissao = registrarProfissao;
	}
}
