package view;

import controller.Grafo;

public class Principal {
	public static void main(String[] args) {
		Grafo grafo=new Grafo();
		int[][] matriz = {
				{0, 1, 0, 0},
			    {1, 0, 0, 0},
			    {0, 0, 0, 1},
			    {0, 0, 1, 0}
			};
		char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		grafo.arestas(matriz, alfabeto);
		grafo.tipoAresta(matriz,alfabeto);
		grafo.grau(matriz,alfabeto);
		if(grafo.eConexo(matriz,alfabeto)) {
			System.out.println("E conexo");
		}else {
			System.out.println("Não é conexo");
		}
	}
}
