package game;

import java.util.Scanner;

public class Jogador {

	public void jogar(Tabuleiro tabuleiro) {
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Digite posição que deseja marcar O: "); // Player always starts, and plays with "O"
		
		while(true) {
			// Movement reading
			int opcao = Integer.parseInt(teclado.next()) - 1; // -1 to consider starting wuth 0
			
			// Movement position
			int linha = (opcao/3);
			int col = (opcao % 3);
			
			if (tabuleiro.mat[linha][col]!=-1 && tabuleiro.mat[linha][col] != 1) {
				// Is the position already filled?
				tabuleiro.mat[linha][col] = 1;
				System.out.println("Jogador jogou");
				tabuleiro.jogadas++;
				break;
			}
			else { // If the move is invalid, it will ask a valid movement
				System.out.println("Digite posição válida para marcar 'O': ");
				
			}

			
		}
		
		
	}

}
