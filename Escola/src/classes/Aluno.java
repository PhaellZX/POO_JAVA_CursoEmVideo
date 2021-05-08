package classes;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public Aluno() {
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada!");
	}
}
