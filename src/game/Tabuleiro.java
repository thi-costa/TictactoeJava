package game;

import java.util.Scanner;

public class Tabuleiro {
	public int mat[][] = new int[3][3]; // Initialing the game board
	int jogadas = 0; // Counter of plays
	int[] placar = {0, 0, 0}; // Scoreboard (player victories, computer victories, drawns)

	public int situacao() {
		// Returns game situation
		return ganhou();
	}

	public void visualizar() {
		// Method to visualie the game board
		
		String out = "";
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				if (mat[i][j] == 0) {
					if(j<2) { // Poistion of the board is empty
						out+="_|";										
					}
					else{
						out+="_\n";						
					}				
				}
				else if(mat[i][j] == 1) { // Player is on this position
					if(j<2) {
						out+="O|";										
					}
					else{
						out+="O\n";						
					}						
				}
				else if(mat[i][j] == -1) { // Computer is on this position
					if(j<2) {
						out+="X|";										
					}
					else{
						out+="X\n";						
					}					
				}
			}
		}
		System.out.println(out); // game board print
		
	}
	
	public int ganhou() {
		// Method to evaluate if the game is over

		if((mat[0][0]==1 && mat[0][1]==1 && mat[0][2]==1)
				||(mat[1][0]==1 && mat[1][1]==1 && mat[1][2]==1)
				||(mat[2][0]==1 && mat[2][1]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][0]==1 && mat[2][0]==1)
				||(mat[0][1]==1 && mat[1][1]==1 && mat[2][1]==1)
				||(mat[0][2]==1 && mat[1][2]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][1]==1 && mat[2][2]==1)
				||(mat[0][2]==1 && mat[1][1]==1 && mat[2][0]==1)) {// Player wins
			System.out.println("Jogador ganhou!");
			
			// Scoreboard update
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
					||(mat[0][2]==-1 && mat[1][1]==-1 && mat[2][0]==-1)) {// Computer wins
			System.out.println("Computador ganhou!");
			
			// Scoreboard update
			placar[1]++;
			placar();
			return 1;
		}
		else if (jogadas==9) { // Draws
			System.out.println("Empate!");
			
			// Scoreboard update
			placar[2]++;
			placar();
			return 1;
		}
		else { // Game is not over
			return 0;
		}
	}
	
	public void placar() { // Report of the scoreboard
		System.out.println("-=-=-=-=-="+"Placar"+"-=-=-=-=-=");
		System.out.println("Vitórias do jogador: " + placar[0]);
		System.out.println("Vitórias do PC: " + placar[1]);
		System.out.println("Empates: " + placar[2]);
		
		
	}


}
