package game;

import java.util.Random;

public class ComputadorC extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * In this level, computer plays randomly
		 */
		
		int sorteios = 0;
		while(true) {			
			Random aleatorio = new Random();
			int randomInteger = aleatorio.nextInt(9); // Sorting moveposition
			int linha = (randomInteger/3); // Movement row
			int col = (randomInteger % 3); // Movement column
			if(tabuleiro.mat[linha][col] != 1 && tabuleiro.mat[linha][col] != -1){
				// Is the position already filled?
				tabuleiro.mat[linha][col] = -1;
				break; // Movement finishes
			}
			sorteios++;		
		}
		tabuleiro.jogadas++;
				
	}
}
		
	
		

