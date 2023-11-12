package controller;

public class Grafo {

	public void arestas(int[][] matriz, char[] alfabeto) {
		// TODO Auto-generated method stub
		int l=0;
		int c=0;
		while(l<5) {
			if(matriz[l][c]==1) {
				System.out.println("Aresta "+alfabeto[l]+" e "+alfabeto[c]);
			}
			if(c==4) {
				l++;
				c=-1;
			}
			c++;
		}
	}

	public void tipoAresta(int[][] matriz, char[] alfabeto) {
		// TODO Auto-generated method stub
		boolean naoDirecionado=true;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(matriz[i][j]!=matriz[j][i]) {
					naoDirecionado=false;
					break;
				}
			}
		}
		
		if(naoDirecionado) {
			System.out.println("O tipo do grafo é não direcionado");
		}else {
			System.out.println("O tipo do grafo é digrafo");
		}
	}

	public void grau(int[][] matriz) {
		// TODO Auto-generated method stub
		
	}

}
