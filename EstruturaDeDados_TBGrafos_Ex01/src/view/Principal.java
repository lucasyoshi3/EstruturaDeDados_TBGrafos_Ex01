package view;

import controller.Grafo;

public class Principal {
	public static void main(String[] args) {
		Grafo grafo=new Grafo();
		int[][] matriz = {
			    {0, 1, 0, 1, 0},
			    {1, 0, 1, 1, 1},
			    {0, 1, 1, 0, 0},
			    {1, 1, 0, 0, 1},
			    {0, 1, 0, 1, 0}
			};
		char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		grafo.arestas(matriz, alfabeto);
		grafo.tipoAresta(matriz,alfabeto);
		grafo.grau(matriz);
	}
}
