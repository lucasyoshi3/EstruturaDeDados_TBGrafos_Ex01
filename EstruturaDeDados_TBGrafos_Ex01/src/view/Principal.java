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
		
		grafo.arestas(matriz);
		grafo.tipoAresta(matriz);
		grafo.grau(matriz);
		if(grafo.eConexo(matriz)) {
			System.out.println("E conexo");
		}else {
			System.out.println("Não é conexo");
		}
		
		if(grafo.eCiclico(matriz)) {
			System.out.println("O grafo é ciclico");
		}else {
			System.out.println("o grafo não é ciclico");
		}
		grafo.listaAdjacencias(matriz);
	}
}
