package exerciciosFixacao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo

		FileInputStream fis = new FileInputStream("random.txt"); // criando o fluxo completo, porém, binário
		
		InputStreamReader isr = new InputStreamReader(fis); // InputStreamReader utilizado para que o fis seja convertido
								    // em formato diferente de binário (int)
		BufferedReader bf = new BufferedReader(isr); //capaz de ler texto

		String linha = bf.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = bf.readLine();
		}
		
		bf.close();
	}
}
