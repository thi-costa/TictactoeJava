package game;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// Instanciação do tabuleiro, jogador e computador
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador player = new Jogador();
		Computador comp = new Computador();
		
		// Implementação do jogo
		while (true) {
			tabuleiro.mat = new int[3][3]; // Tabuleiro reinicializado
			tabuleiro.jogadas = 0; // Contagem de jogadas reiniciada
			
			
			// Leitura de input de usuário (para entradas de teclado)
			Scanner teclado = new Scanner(System.in);
			System.out.println("Jogo da velha\n\nEscolha a dificuldade A, B ou C: ");
			String opcao = teclado.next();

			while (true) {
				// Instanciação de dificuldade escolhida
				if (opcao.equals("A")) {
					comp = new ComputadorA();
					break;
				} else if (opcao.equals("B")) {
					comp = new ComputadorB();
					break;
				} else if (opcao.equals("C")) {
					comp = new ComputadorC();
					break;
				} else {
					// Condição para considerar dados inválidos de dificuldade
					System.out.println("Insira um nível de dificuldade válido 'A', 'B' ou 'C': ");
					opcao = teclado.next();
				}
			}

			int vez = 1;
			do {
				if (vez == 1) { // vez do Jogador Humano
					player.jogar(tabuleiro); //jogador joga
					vez = 2; // passa vez
				} else if (vez == 2) { // vez de jogada do computador
					System.out.println("Jogada do Computador");
					comp.jogar(tabuleiro); // computador joga
					vez = 1; // passa vez
				}

				tabuleiro.visualizar();

			} while (tabuleiro.situacao() == 0); // Jogo ainda continua?

			do {
				// Laço para saber se usuário deseja começar novo jogo ou encerrar partida
				System.out.println("Deseja continuar? (S/N)");
				opcao = teclado.next();

				if (opcao.equals("S")) {
					System.out.println("Novo jogo");
					break;
				} else if (opcao.equals("N")) {
					System.out.println("_________Jogo finalizado_________");
					break;
				} else {
					System.out.println("Insira uma opção válida, continuar (S) ou parar (N): ");
					opcao = teclado.next();
				}

			} while (!opcao.equals("S") && !opcao.equals("N"));
			
			if (opcao.equals("S")) { // Nova partida
				continue;
			} else if (opcao.equals("N")) { // Partida encerrada
				break;
			}

		}

	}

}
