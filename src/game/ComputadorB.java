package game;

public class ComputadorB  extends Computador{
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse nível de dificuldade, computador joga da primeira posição até a última, na ordem
		 * do tabuleiro
		 * 
		 */
		int jogou = 0;
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
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
