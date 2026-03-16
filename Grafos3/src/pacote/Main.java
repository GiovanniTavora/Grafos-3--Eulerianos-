package pacote;

public class Main {
	public static void main(String[] args) {
		
		String[] nos = {"1", "2", "3", "4", "5", "6", "7"};
		
		Grafo grafo1 = new Grafo (nos);
		
		grafo1.adicionarAresta("1", "2");
		grafo1.adicionarAresta("1", "3");
		grafo1.adicionarAresta("1", "6");
		grafo1.adicionarAresta("1", "7");
		
		grafo1.adicionarAresta("2", "3");
		grafo1.adicionarAresta("2", "4");
		grafo1.adicionarAresta("2", "5");
		
		grafo1.adicionarAresta("3", "4");
		grafo1.adicionarAresta("3", "7");
		
		grafo1.adicionarAresta("4", "5");
		grafo1.adicionarAresta("4", "6");
		
		grafo1.adicionarAresta("5", "6");
		grafo1.adicionarAresta("5", "7");
		
		grafo1.adicionarAresta("6", "7");
		
		System.out.println("Análise do Grafo 1: ");
		
		if(grafo1.analiseEuleriano() == true) {
			System.out.println("Esse grafo é Euleriano!");
		} else {
			System.out.println("Esse grafo não é euleriano...");
		}
		
		if(grafo1.analiseSemiEuleriano() == true) {
			System.out.println("Esse grafo é Semi-Euleriano!");
		} else {
			System.out.println("Esse grafo não é Semi-Euleriano...");
		}
		
		if(grafo1.analiseNaoEuleriano() == true) {
			System.out.println("Esse grafo é Não-Euleriano!\n");
		} else {
			System.out.println("Esse grafo não é Não-Euleriano...\n");
		}
		
		Grafo grafo2 = new Grafo (nos);
		
		grafo2.adicionarAresta("1", "2");
		grafo2.adicionarAresta("1", "3");
		grafo2.adicionarAresta("1", "6");
		grafo2.adicionarAresta("1", "7");
		
		grafo2.adicionarAresta("2", "3");
		grafo2.adicionarAresta("2", "4");
		grafo2.adicionarAresta("2", "5");
		
		grafo2.adicionarAresta("3", "7");
		grafo2.adicionarAresta("3", "4");
		
		grafo2.adicionarAresta("4", "5");
		
		grafo2.adicionarAresta("5", "6");
		grafo2.adicionarAresta("5", "7");
		
		grafo2.adicionarAresta("6", "7");
		
		System.out.println("Análise do Grafo 2: ");
		
		if(grafo2.analiseEuleriano() == true) {
			System.out.println("Esse grafo é Euleriano!");
		} else {
			System.out.println("Esse grafo não é euleriano...");
		}
		
		if(grafo2.analiseSemiEuleriano() == true) {
			System.out.println("Esse grafo é Semi-Euleriano!");
		} else {
			System.out.println("Esse grafo não é Semi-Euleriano...");
		}
		
		if(grafo2.analiseNaoEuleriano() == true) {
			System.out.println("Esse grafo é Não-Euleriano!\n");
		} else {
			System.out.println("Esse grafo não é Não-Euleriano...\n");
		}
		
		Grafo grafo3 = new Grafo (nos);
		
		grafo3.adicionarAresta("1", "2");
		grafo3.adicionarAresta("1", "3");
		grafo3.adicionarAresta("1", "6");
		grafo3.adicionarAresta("1", "7");		
		
		grafo3.adicionarAresta("2", "3");
		grafo3.adicionarAresta("2", "4");
		
		grafo3.adicionarAresta("3", "4");
		
		grafo3.adicionarAresta("4", "5");
		
		grafo3.adicionarAresta("5", "6");
		
		grafo3.adicionarAresta("6", "7");
		
		System.out.println("Análise do Grafo 3: ");
		
		if(grafo3.analiseEuleriano() == true) {
			System.out.println("Esse grafo é Euleriano!");
		} else {
			System.out.println("Esse grafo não é euleriano...");
		}
		
		if(grafo3.analiseSemiEuleriano() == true) {
			System.out.println("Esse grafo é Semi-Euleriano!");
		} else {
			System.out.println("Esse grafo não é Semi-Euleriano...");
		}
		
		if(grafo3.analiseNaoEuleriano() == true) {
			System.out.println("Esse grafo é Não-Euleriano!\n");
		} else {
			System.out.println("Esse grafo não é Não-Euleriano...\n");
		}
		
		Grafo grafo4 = new Grafo (nos);
		
		grafo4.adicionarAresta("1", "2");
		grafo4.adicionarAresta("1", "3");
		grafo4.adicionarAresta("1", "6");
		grafo4.adicionarAresta("1", "7");		
		
		grafo4.adicionarAresta("2", "3");
		
		grafo4.adicionarAresta("3", "4");
		
		grafo4.adicionarAresta("4", "5");
	
		grafo4.adicionarAresta("5", "6");
		
		grafo4.adicionarAresta("6", "7");
		
		System.out.println("Análise do Grafo 4: ");
		
		if(grafo4.analiseEuleriano() == true) {
			System.out.println("Esse grafo é Euleriano!");
		} else {
			System.out.println("Esse grafo não é euleriano...");
		}
		
		if(grafo4.analiseSemiEuleriano() == true) {
			System.out.println("Esse grafo é Semi-Euleriano!");
		} else {
			System.out.println("Esse grafo não é Semi-Euleriano...");
		}
		
		if(grafo4.analiseNaoEuleriano() == true) {
			System.out.println("Esse grafo é Não-Euleriano!\n");
		} else {
			System.out.println("Esse grafo não é Não-Euleriano...\n");
		}
	}
}
