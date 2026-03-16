package pacote;

public class Grafo {
	private String[] nos;
	private int[][] matriz;
	private int n;
	
	public Grafo(String[] nos) {
		this.nos = nos;
		this.n = nos.length;	
		this.matriz = new int [n][n];
	}
	
	private int indice(String num) {
		for(int i = 0; i < n; i++) {
			if(nos[i].equals(num)) {
				return i;
			}
		}
		return 0;
	}
	
	public void adicionarAresta(String num1, String num2) {
		int i = indice (num1);
		int j = indice (num2);
		
		if (i != -1 && j != -1) {
			matriz[i][j] = 1;
			matriz[j][i] = 1;
		}
	}
	
	public int grau(String num) {
		int i = indice (num);
		int soma = 0;
		
		for (int j = 0; j < n; j++) {
			soma += matriz[i][j];
		}
		return soma;
	}
	
	public void vizinhos(String num) {
		int i = indice (num);
		
		System.out.println("Vizinhos de " + num + ": ");
		
		for(int j = 0; j < n; j++) {
			if(matriz[i][j] == 1) {
				System.out.println(nos[j] + "");
			}
		}
		System.out.println();
	}
	
	public void analiseGrafo() {
		int maior = -1;
		int menor = Integer.MAX_VALUE;	
		String noMaior = "";
		String noMenor = "";
		
		for(int i = 0; i < n; i++) {
			int soma = 0;
			
			for(int j = 0; j < n; j++) {
				soma += matriz[i][j];
			}
			
			if(soma > maior) {
				maior = soma;
				noMaior=nos[i];
			}
			
			if (soma < menor) {
				menor = soma;
				noMenor = nos[i];
			}	
			
		}
		
		System.out.println("Nó com maior grau: " + noMaior);
		System.out.println("Grau: " + maior);
		vizinhos(noMaior);
		
		System.out.println("Nó com menor grau: " + noMenor);
		System.out.println("Grau: " + menor);
		vizinhos(noMenor);
		
	}
	
	public boolean analiseDirac() {
		if(n < 3) {
			return false;
		}
		
		for(int i = 0; i < n; i++) {
			int grauAtual = grau(nos[i]);
			
			if(grauAtual < n / 2.0) {
				return false;
			}	
		}
		
		return true;
	}
		
	public boolean analiseEuleriano() {
		for(int i = 0; i < n; i++) {
			int grauAtual = grau(nos[i]);
			
			if(grauAtual % 2 != 0) {
				return false;
			}
		}
		
		return true;
	}

	public boolean analiseSemiEuleriano() {
		
		int impares = 0;
		
		for(int i = 0; i < n; i++) {
			int grauAtual = grau(nos[i]);
			
			if(grauAtual % 2 != 0 ) {
				impares++;
			}
			
			if(impares == 2) {
				return true;
			}
			
		}
		return false;
	}
	
	public boolean analiseNaoEuleriano() {
		
		int impares = 0;
		
		for(int i = 0; i < n; i++) {
			int grauAtual = grau(nos[i]);
			
			if(grauAtual % 2 != 0) {
				impares++;
			}	
		}
		
		if(impares == 2) {
			return true;
		}
		return false;
	}
}
