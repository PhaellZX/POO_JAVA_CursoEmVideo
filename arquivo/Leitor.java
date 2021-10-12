package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor {

	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("arquivo.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			
			BufferedReader br = new BufferedReader(input);
			
			String linha;
			
			do {
				linha = br.readLine();
				if(linha!=null) {
					System.out.println(linha);
				}
			}while(linha != null);
			
		} catch (Exception e) {
			System.out.println("Erro ao abrir o arquivo!");
		}
	}

}
