package game;

public class ComputadorA  extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * Nesse n�vel de dificuldade, computador joga da �ltima posi��o at� a primeira, na ordem
		 * inversa do tabuleiro
		 * 
		 */
		int jogou = 0;
		for(int i=2; i>=0;i--) {
			for(int j=2; j>=0;j--) {
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
