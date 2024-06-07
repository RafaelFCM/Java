import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in); 
		
		int m [][]= new int[2][2];
		int r [][]= new int[2][2];
		int maior=0;
		
		for (int i=0; i < 2; i++) {
			for (int j=0; j < 2; j++) {
				System.out.print("Informe um número M["+i+","+j+"]= ");
				m[i][j] = entrada.nextInt();
				
				if (m[i][j]>maior) {
					maior = m[i][j];
				} 
				
			}
		}
		
		for (int i=0; i < 2; i++) {
			for (int j=0; j < 2; j++) {
				r[i][j] = m[i][j] * maior;
			}
		}
		
		for (int i=0; i < 2; i++) {
			for (int j=0; j < 2; j++) {
				System.out.println("Resultado - Matriz R["+i+","+j+"]= "+r[i][j]);
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
