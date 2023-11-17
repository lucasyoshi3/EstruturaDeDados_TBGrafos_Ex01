package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Grafo {

	public void arestas(int[][] matriz, char[] alfabeto) {
		// TODO Auto-generated method stub
		int l=0;
		int c=0;
		while(l<matriz.length) {
			if(matriz[l][c]==1) {
				System.out.println("Aresta "+alfabeto[l]+" e "+alfabeto[c]);
			}
			if(c==matriz[0].length-1) {
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

	public void grau(int[][] matriz, char[] alfabeto) {
		// TODO Auto-generated method stub
		int soma=0;
		int i,j;
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz[i].length;j++) {
				soma+=matriz[i][j];
			}
			System.out.println("Grau da vertice da "+alfabeto[i]+": "+soma);
			soma=0;
		}
	}

	public boolean eConexo(int[][] matriz, char[] alfabeto) {
		// TODO Auto-generated method stub
		for(int i=0;i<matriz.length;i++) {
			if(matriz[0][i]==1) {
				break;
			}
			if(i==matriz.length-1) {
				return false;
			}
		}
		Stack<Integer> ordem= new Stack<Integer>();
		List<Integer> visitados=new ArrayList<Integer>();
		int tamanho=matriz.length;
		ordem.push(0);
		visitados.add(0);
		while(!ordem.isEmpty()) {
			
			int vertice=ordem.peek();
			boolean implementado=false;
			
			for(int j=0;j<tamanho;j++) {
				if(matriz[vertice][j]==1 && !visitados.contains(j)) {
					ordem.push(j);
					visitados.add(j);
					implementado=true;
					break;
				}
			}
			if(!implementado) {
				ordem.pop();
			}
		}
		for(int i=0;i<tamanho;i++) {
			if(!visitados.contains(i)){
				return false;
			}
		}
		return true;
	}

	public boolean eCiclico(int[][] matriz) {
		// TODO Auto-generated method stub
		int tamanho=matriz.length;
		for(int i=0;i<tamanho;i++) {
			boolean [] visitados=new boolean[tamanho];
			Stack<Integer> ordem= new Stack<Integer>();
			ordem.push(i);
			
			while (!ordem.isEmpty()) {
	            int vertice = ordem.pop();

	            if (visitados[vertice]) {
	                return true;
	            }

	            visitados[vertice] = true;

	            for (int j = 0; j < tamanho; j++) {
	                if (matriz[vertice][j] == 1 && !visitados[j]) {
	                    ordem.push(j);
	                }
	            }
	        }
		}
		return false;
	}

}






	
