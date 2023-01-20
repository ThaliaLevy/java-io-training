package exerciciosFixacao;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ex04 {

	public static void main(String[] args) throws IOException {
		//Fluxo de saída
		
	//	PrintStream ps = new PrintStream("random.txt");
	//	PrintStream ps2 = new PrintStream(new File("random.txt")); //caso não exista o arquivo
		PrintWriter pw = new PrintWriter("random.txt");

		pw.println("Testando exerc 04");
		pw.println();
		pw.println();
		pw.println("Testando pós-linha - 2");

		pw.close();
	}
}
