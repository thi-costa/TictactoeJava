package game;

public class ComputadorB  extends Computador{
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse n�vel de dificuldade, computador joga da primeira posi��o at� a �ltima, na ordem
		 * do tabuleiro
		 * 
		 */
		int jogou = 0;
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if (tabuleiro.mat[i][j]!=-1 && tabuleiro.mat[i][j] != 1) {
					// verifica��o se casa do tabuleiro n�o est� preenchida
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
