package sorteioDeFrases;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String caminho = System.getProperty("user.dir") + "\\frases.txt";
		Frase frase = new Frase();

		String opcaoEscolhida = null;

		verificarExistenciaTxt(caminho);

		do {
			exibirMenu();
			opcaoEscolhida = sc.nextLine();

			switch (opcaoEscolhida) {
			case "1": {
				frase.salvarFrase(sc, caminho);
				break;
			}
				
			case "2":
				frase.exibirFrases(caminho);

				break;

			case "3":
				System.out.println("Programa encerrado.");

				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (!opcaoEscolhida.equals("3"));

		sc.close();
	}

	public static void exibirMenu() {
		System.out.println("\n---------------------- Menu ----------------------");
		System.out.print("\n1 - Cadastrar frase; \n2 - Sortear 5 frases; \n3 - Sair\n");
	}

	public static void verificarExistenciaTxt(String caminho) {
		try {
			File f = new File(caminho);
			String auxCaminho = caminho.substring(0, caminho.lastIndexOf("\\"));
			File fDir = new File(auxCaminho);
			fDir.mkdir();
			f.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
