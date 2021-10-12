package arquivo;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CriarEscreverArquivo {

	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("arquivo.csv");
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println("Linha1 Coluna1 ; Linha1 Coluna2 ; Linha1 Coluna3");
			pr.println("Linha2 Coluna1 ; Linha2 Coluna2 ; Linha2 Coluna3");
			pr.println("Linha3 Coluna1 ; Linha3 Coluna2 ; Linha3 Coluna3");
			
			pr.close();
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar abrir o arquivo!");
		}
	}

}
