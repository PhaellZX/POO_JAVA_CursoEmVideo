package classes;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public void marcaLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovado(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if(this.getAprovado()) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println("=====RESULTADO DA LUTA======");
			switch(vencedor) {
			case 0:
				System.out.println("Empatou!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println("Venceu " + this.getDesafiado().getNome());
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:
				System.out.println("Vit�ria do " + this.getDesafiante().getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		System.out.println("=====================");
		}else {
			System.out.println("Luta n�o pode acontecer");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
}
