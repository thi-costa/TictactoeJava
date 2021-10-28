package game;

import java.util.Scanner;

public class Jogador {

	public void jogar(Tabuleiro tabuleiro) {
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Digite posi��o que deseja marcar O: "); // Jogador sempre joga 'O' e sempre come�a
		
		while(true) {
			// Leitura de jogada
			int opcao = Integer.parseInt(teclado.next()) - 1; // -1 para onsiderar contagem a partir de 1
			
			// Posi��o de jogada
			int linha = (opcao/3);
			int col = (opcao % 3);
			
			if (tabuleiro.mat[linha][col]!=-1 && tabuleiro.mat[linha][col] != 1) {
				// verifica��o se casa do tabuleiro n�o est� preenchida
				tabuleiro.mat[linha][col] = 1;
				System.out.println("Jogador jogou");
				tabuleiro.jogadas++;
				break;
			}
			else { // Para uma posi��o inv�lida, ser� pedido que jogador repita jogada
				System.out.println("Digite posi��o v�lida para marcar 'O': ");
				
			}

			
		}
		
		
	}

}
