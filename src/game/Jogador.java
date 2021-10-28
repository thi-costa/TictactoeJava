package game;

import java.util.Scanner;

public class Jogador {

	public void jogar(Tabuleiro tabuleiro) {
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Digite posição que deseja marcar O: "); // Jogador sempre joga 'O' e sempre começa
		
		while(true) {
			// Leitura de jogada
			int opcao = Integer.parseInt(teclado.next()) - 1; // -1 para onsiderar contagem a partir de 1
			
			// Posição de jogada
			int linha = (opcao/3);
			int col = (opcao % 3);
			
			if (tabuleiro.mat[linha][col]!=-1 && tabuleiro.mat[linha][col] != 1) {
				// verificação se casa do tabuleiro não está preenchida
				tabuleiro.mat[linha][col] = 1;
				System.out.println("Jogador jogou");
				tabuleiro.jogadas++;
				break;
			}
			else { // Para uma posição inválida, será pedido que jogador repita jogada
				System.out.println("Digite posição válida para marcar 'O': ");
				
			}

			
		}
		
		
	}

}
