package game;

public class ComputadorA  extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse nível de dificuldade, computador joga da última posição até a primeira, na ordem
		 * inversa do tabuleiro
		 * 
		 */
		int jogou = 0;
		for(int i=2; i>=0;i--) {
			for(int j=2; j>=0;j--) {
				if (tabuleiro.mat[i][j]!=-1 && tabuleiro.mat[i][j] != 1) {
					// verificação se casa do tabuleiro não está preenchida
					tabuleiro.mat[i][j] = -1;
					jogou = 1;
					break;
				}
							
			}
			if(jogou==1) { // Jogada finalizada
				break;
			}
		}
		tabuleiro.jogadas++;
	}

}
