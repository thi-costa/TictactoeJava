package game;

public class ComputadorB  extends Computador{
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * In this level, computer plays from the first to the last positions
		 * 
		 */
		int jogou = 0;
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if (tabuleiro.mat[i][j]!=-1 && tabuleiro.mat[i][j] != 1) {
					// Is the position already filled?
					tabuleiro.mat[i][j] = -1;
					jogou = 1;
					break;
				}
							
			}
			if(jogou==1) { // Movement finishes
				break;
			}
		}
		tabuleiro.jogadas++;
	}

}
