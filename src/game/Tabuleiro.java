package game;

import java.util.Scanner;

public class Tabuleiro {
	public int mat[][] = new int[3][3]; // Inicialização de tabuleiro
	int jogadas = 0; // Contagem de jogadas
	int[] placar = {0, 0, 0}; // Placar (vitórias de jogador, PC e empates)

	public int situacao() {
		// Retorna situação pelo método "ganhou()"
		return ganhou();
	}

	public void visualizar() {
		// Método para visualização do tabuleiro
		
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
		System.out.println(out); // Impressão do tabuleiro
		
	}
	
	public int ganhou() {
		// Método para avaliar se jogo continua (alguém ganhou ou se teve empate)

		if((mat[0][0]==1 && mat[0][1]==1 && mat[0][2]==1)
				||(mat[1][0]==1 && mat[1][1]==1 && mat[1][2]==1)
				||(mat[2][0]==1 && mat[2][1]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][0]==1 && mat[2][0]==1)
				||(mat[0][1]==1 && mat[1][1]==1 && mat[2][1]==1)
				||(mat[0][2]==1 && mat[1][2]==1 && mat[2][2]==1)
				||(mat[0][0]==1 && mat[1][1]==1 && mat[2][2]==1)
				||(mat[0][2]==1 && mat[1][1]==1 && mat[2][0]==1)) {//Condição para jogador ganhar
			System.out.println("Jogador ganhou!");
			
			// Atualização de placar
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
					||(mat[0][2]==-1 && mat[1][1]==-1 && mat[2][0]==-1)) {//Condição para PC ganhar
			System.out.println("Computador ganhou!");
			
			// Atualização de placar
			placar[1]++;
			placar();
			return 1;
		}
		else if (jogadas==9) { // Condição para empate
			System.out.println("Empate!");
			
			// Atualização de placar
			placar[2]++;
			placar();
			return 1;
		}
		else { // Jogo não finalizado
			return 0;
		}
	}
	
	public void placar() { // Método que retorna informações sobre placar
		System.out.println("-=-=-=-=-="+"Placar"+"-=-=-=-=-=");
		System.out.println("Vitórias do jogador: " + placar[0]);
		System.out.println("Vitórias do PC: " + placar[1]);
		System.out.println("Empates: " + placar[2]);
		
		
	}


}
