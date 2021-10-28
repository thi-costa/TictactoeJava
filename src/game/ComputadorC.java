package game;

import java.util.Random;

public class ComputadorC extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse n�vel de dificuldade, computador joga de modo completamente
		 * aleat�rio, sorteia posi��es no tabuleiro, at� a primeira vazia que
		 * encontrar
		 */
		
		int sorteios = 0;
		while(true) {			
			Random aleatorio = new Random();
			int randomInteger = aleatorio.nextInt(9); // Sorteio de posi��o
			int linha = (randomInteger/3); // Linha de jogada
			int col = (randomInteger % 3); // Coluna de jogada
			if(tabuleiro.mat[linha][col] != 1 && tabuleiro.mat[linha][col] != -1){
				// verifica��o se casa do tabuleiro n�o est� preenchida
				tabuleiro.mat[linha][col] = -1;
				break; // Jogada finalizada
			}
			sorteios++;		
		}
		tabuleiro.jogadas++;
				
	}
}
		
	
		

