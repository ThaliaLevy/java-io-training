package sorteioDeFrases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Frase {

	public int lerUltimoNumero(String caminho) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			int i = 0;
			String[] aux;

			while (br.ready()) {
				br.ready();
				aux = br.readLine().split("#");
				i = Integer.parseInt(aux[0]);
			}

			br.close();

			return i;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int gerarProximoNumero(String caminho) {
		try {
			int ultimoNumero = lerUltimoNumero(caminho);

			return ++ultimoNumero;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public boolean salvarFrase(Scanner sc, String caminho) {
		try {
			System.out.println("\n--------------------------------------------------\n");
			System.out.print("Digite a frase a ser salva: ");
			String frase = sc.nextLine();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true));
			bw.write(gerarProximoNumero(caminho) + "#" + frase);
			bw.newLine();
			bw.close();
			
			System.out.println("\nFrase salva com sucesso!");
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public Set<Integer> sortearNumeros(String caminho) {
		int ultimoNumeroRegistrado = lerUltimoNumero(caminho);
		int quantidadeNumerosNecessarios = 5;
		Random numerosAleatorios = new Random();

		Set<Integer> numerosSorteados = new HashSet<>();

		for (int i = 0; i != quantidadeNumerosNecessarios; i++) {
			int numeroSorteado = numerosAleatorios.nextInt(ultimoNumeroRegistrado) + 1;
			int tamanhoAnterior = numerosSorteados.size();
			numerosSorteados.add(numeroSorteado);

			int novoTamanho = numerosSorteados.size();

			if (novoTamanho == tamanhoAnterior) {
				i--;
			}
		}

		return numerosSorteados;
	}

	public void exibirFrases(String caminho) {
		try {
			System.out.println("\n--------------------------------------------------\n");
			
			Set<Integer> numerosSorteados = sortearNumeros(caminho);

			BufferedReader br = new BufferedReader(new FileReader(caminho));

			while (br.ready()) {
				br.ready();

				String[] informacoes = br.readLine().split("#");
				int numeroDaFrase = Integer.parseInt(informacoes[0]);
				String frase = informacoes[1];

				for (Integer numeroSorteado : numerosSorteados) {
					if (numeroSorteado == numeroDaFrase) {
						System.out.println(numeroDaFrase + " - " + frase);
					}
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
