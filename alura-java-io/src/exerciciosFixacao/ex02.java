package exerciciosFixacao;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ex02 {

	public static void main(String[] args) throws IOException {
		// Fluxo de saída com arquivo

		OutputStream fos = new FileOutputStream("random.txt"); // criando o fluxo completo, porém, binário
		Writer osw = new OutputStreamWriter(fos); // instância utilizada para que o fis possa ser utilizado											// sem ser na forma de binário
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("\n Aerosmith - Amazing");
		bw.newLine();
		
		bw.close();
	}

}
