package game;

import java.util.Random;

public class ComputadorC extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse nível de dificuldade, computador joga de modo completamente
		 * aleatório, sorteia posições no tabuleiro, até a primeira vazia que
		 * encontrar
		 */
		
		int sorteios = 0;
		while(true) {			
			Random aleatorio = new Random();
			int randomInteger = aleatorio.nextInt(9); // Sorteio de posição
			int linha = (randomInteger/3); // Linha de jogada
			int col = (randomInteger % 3); // Coluna de jogada
			if(tabuleiro.mat[linha][col] != 1 && tabuleiro.mat[linha][col] != -1){
				// verificação se casa do tabuleiro não está preenchida
				tabuleiro.mat[linha][col] = -1;
				break; // Jogada finalizada
			}
			sorteios++;		
		}
		tabuleiro.jogadas++;
				
	}
}
		
	
		

