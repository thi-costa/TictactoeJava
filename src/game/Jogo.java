package game;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// instantiation of the board, player and computer
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador player = new Jogador();
		Computador comp = new Computador();
		
		// Implementation of the game
		while (true) {
			for (int i = 0; i < 100; ++i)  {
				System.out.println(); // Clear the screen
			}


			tabuleiro.mat = new int[3][3]; // Board reseted
			tabuleiro.jogadas = 0; // Resetting the plays count
			
			
			// Reading user movement (keyboard)
			Scanner teclado = new Scanner(System.in);
			System.out.println("Jogo da velha\n\nEscolha a dificuldade A, B ou C: ");
			String opcao = teclado.next();

			while (true) {
				// Choosing difficult
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
					// Condition for invalid data
					System.out.println("Insira um nível de dificuldade válido 'A', 'B' ou 'C': ");
					opcao = teclado.next();
				}
			}

			int vez = 1;
			do {
				if (vez == 1) { // human player turn
					player.jogar(tabuleiro); // human plays
					vez = 2; // next turn
				} else if (vez == 2) { // computer turn
					System.out.println("Jogada do Computador");
					comp.jogar(tabuleiro); // computer plays
					vez = 1; // next turn
				}

				tabuleiro.visualizar();

			} while (tabuleiro.situacao() == 0); // Is the game finished?

			do {
				// Do-while loop to start a new match or finishing the game
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
			
			if (opcao.equals("S")) { // New match
				continue;
			} else if (opcao.equals("N")) { // Game finished
				teclado.close();				
				break;
			}

		}

	}

}
