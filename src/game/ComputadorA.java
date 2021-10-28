package game;

public class ComputadorA  extends Computador{
	
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		/*
		 * In this level, computer plays from the last to the first positions
		 * 
		 * 
		 */
		int jogou = 0;
		for(int i=2; i>=0;i--) {
			for(int j=2; j>=0;j--) {
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
