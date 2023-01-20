package exerciciosFixacao;

import java.util.Locale;

public class ex05 {

	public static void main(String[] args) {
		//String teste = "3";
		int valor1 = 6;
		String imprimir = String.format(Locale.CHINA, "%08d", valor1);

		System.out.println(imprimir);
	}
}
