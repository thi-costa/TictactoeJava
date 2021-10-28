package game;

import java.util.Scanner;

public class Tabuleiro {
	public int mat[][] = new int[3][3]; // Inicializa��o de tabuleiro
	int jogadas = 0; // Contagem de jogadas
	int[] placar = {0, 0, 0}; // Placar (vit�rias de jogador, PC e empates)

	public int situacao() {
		// Retorna situa��o pelo m�todo "ganhou()"
		return ganhou();
	}

	public void visualizar() {
		// M�todo para visualiza��o do tabuleiro
		
		String out = "";
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				if (mat[i][j] == 0) {
					if(j<2) { // Casa do tabuleiro vazia
						out+="_|";										
					}
					else{
						out+="_\n";						
					}				
				}
				else if(mat[i][j] == 1) { // Casa em que jogador jogou
					if(j<2) {
						out+="O|";										
					}
					else{
						out+="O\n";						
					}						
				}
				else if(mat[i][j] == -1) { // Casa em que computador jogou
					if(j<2) {
						out+="X|";										
					}
					else{
						out+="X\n";						
					}					
				}
			}
		}
		System.out.println(out); // Impress�o do tabuleiro
		
	}
	
	public int ganhou() {
		// M�todo para avaliar se jogo continua (algu�m ganhou ou se teve empate)

		if((mat[0][0]==1 && mat[0][1]==1 && mat[0][2]==1)
				||(mat[1][0]==1 && mat[1][1]==1 && mat[1][2]==1)
				||(mat[2][0]==1 && mat[2][1]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][0]==1 && mat[2][0]==1)
				||(mat[0][1]==1 && mat[1][1]==1 && mat[2][1]==1)
				||(mat[0][2]==1 && mat[1][2]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][1]==1 && mat[2][2]==1)
				||(mat[0][2]==1 && mat[1][1]==1 && mat[2][0]==1)) {//Condi��o para jogador ganhar
			System.out.println("Jogador ganhou!");
			
			// Atualiza��o de placar
			placar[0]++;
			placar();
			return 1;
		}
		else if((mat[0][0]==-1 && mat[0][1]==-1 && mat[0][2]==-1)
					||(mat[1][0]==-1 && mat[1][1]==-1 && mat[1][2]==-1)
					||(mat[2][0]==-1 && mat[2][1]==-1 && mat[2][2]==-1)
					||(mat[0][0]==-1 && mat[1][0]==-1 && mat[2][0]==-1)
					||(mat[0][1]==-1 && mat[1][1]==-1 && mat[2][1]==-1)
					||(mat[0][2]==-1 && mat[1][2]==-1 && mat[2][2]==-1)
					||(mat[0][0]==-1 && mat[1][1]==-1 && mat[2][2]==-1)
					||(mat[0][2]==-1 && mat[1][1]==-1 && mat[2][0]==-1)) {//Condi��o para PC ganhar
			System.out.println("Computador ganhou!");
			
			// Atualiza��o de placar
			placar[1]++;
			placar();
			return 1;
		}
		else if (jogadas==9) { // Condi��o para empate
			System.out.println("Empate!");
			
			// Atualiza��o de placar
			placar[2]++;
			placar();
			return 1;
		}
		else { // Jogo n�o finalizado
			return 0;
		}
	}
	
	public void placar() { // M�todo que retorna informa��es sobre placar
		System.out.println("-=-=-=-=-="+"Placar"+"-=-=-=-=-=");
		System.out.println("Vit�rias do jogador: " + placar[0]);
		System.out.println("Vit�rias do PC: " + placar[1]);
		System.out.println("Empates: " + placar[2]);
		
		
	}


}
