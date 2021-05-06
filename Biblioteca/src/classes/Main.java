package classes;

public class Main {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[4];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Apredendo Java","Jos� da Silva",300,p[0]);
		l[1] = new Livro("POO para Iniciantes","Pedro Paulo",500,p[1]);
		l[2] = new Livro("Java Avan�ado","Maria Candido",800,p[0]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		
		System.out.println(l[0].detalhes());
		
		System.out.println(l[1].detalhes());
	}
}
