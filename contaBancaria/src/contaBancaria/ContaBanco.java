package contaBancaria;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.status);
		
	}
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int nc) {
		this.numConta = nc;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if(t == "CC") {
			this.setSaldo(50.00f);
		
		}else if(t =="CP") {
			this.setSaldo(150.00f);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
			
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta em débito");
			
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(double v) {
		if(this.status = true) {
			this.setSaldo(this.getSaldo() + v); // this.saldo =+ v;
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar!");
		}
	}
	
	public void sacar(double v) {
		if(this.status = true) {
			if(this.getSaldo() >= v) {
			setSaldo(getSaldo() - v); // this.saldo =- v;
			System.out.println("Saque realizado na conta " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossível sacar!");
		}
	}
	public void pagarMensal() {
		
		int v = 0;
		
		if(this.getTipo() == "CC") {
			v = 12;
			
		}if(this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.status = true) {
			if(this.getSaldo() > v) {
				setSaldo(getSaldo() - v);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			
		} else {
			System.out.println("Impossível pagar!");	
		}
	}
}
