package exerciciosFixacao;

import java.io.FileWriter;
import java.io.IOException;

public class ex03 {

	public static void main(String[] args) throws IOException {

	FileWriter fw = new FileWriter("random.txt");
	fw.write("Olá!");
	fw.write(System.lineSeparator());
	fw.write(System.lineSeparator());
	fw.write("Tudo bem?"); //pular linha, porém, é mais "bonito" usar newLine()
	
	fw.close();
	}

}