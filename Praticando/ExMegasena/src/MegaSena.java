import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int resultado[] = new int [61];
		int apostado[] = new int [61];
		int j=0, c=0, acertos=0;
		int somaResultado=0, somaApostado=0;
		
		for (int i=1; i<61; i++) {
			System.out.print("N�mero "+i+" foi sorteado? (1=Sim 0=N�o) ");			
			resultado[i]=entrada.nextInt();
			if (resultado[i]==1) {
				somaResultado++;
			}	
		}
		
		if (somaResultado!=6) {
			System.out.println("Tem algum erro no sorteio, refa�a");
			entrada.close();
		}
		System.out.println();
		System.out.println();
		
		for (int i=1; i<61; i++) {
			System.out.print("N�mero "+i+" foi apostado? (1=Sim 0=N�o) ");
			apostado[i]=entrada.nextInt();
			if (apostado[i]==1) {
				somaApostado++;
			}	
		}
		
		if (somaApostado!=6) {
			System.out.println("Tem algum erro na aposta, refa�a");
		}
		System.out.println();
		
		
		System.out.println("------ N�MEROS SORTEADOS ------");
		System.out.println();
		for (int i=1; i<61; i++) {
			if (resultado[i]==1) {
				System.out.println("Informe o "+(++j)+"� n�mero sorteado: "+i);
			}			
		}
		System.out.println("----------------------------");
		for (int i=1; i<11; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=11; i<21; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=21; i<31; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=31; i<41; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=41; i<51; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=51; i<61; i++) {
			if (resultado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (resultado[i]==1) {
					System.out.print("X ");				
				}
			}
		}	
		System.out.println();
		
		
		System.out.println("------ N�MEROS APOSTADOS ------");
		System.out.println();
		for (int i=1; i<60; i++) {
			if (apostado[i]==1) {
				System.out.println("Informe o "+(++c)+"� n�mero apostado: "+i);
				if (resultado[i]==apostado[i]) {
					acertos++;
				}
			}			
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		for (int i=1; i<11; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=11; i<21; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=21; i<31; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=31; i<41; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=41; i<51; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}
		System.out.println();
		for (int i=51; i<61; i++) {
			if (apostado[i]==0) {
				System.out.print(i+" ");				
			}else {
				if (apostado[i]==1) {
					System.out.print("X ");				
				}
			}
		}	
		System.out.println();
		System.out.println();
		
		
		if (acertos==6) {
			System.out.println("Resultado: Acertos= "+acertos+" - Usu�rio fez uma SENA!");
		}else {
			if (acertos==5) {
				System.out.println("Resultado: Acertos= "+acertos+" - Usu�rio fez uma QUINA!");
			}else {
				if (acertos==4) {
					System.out.println("Resultado: Acertos= "+acertos+" - Usu�rio fez uma QUADRA!");
				}else {
					System.out.println("Resultado: Acertos= "+acertos+" - Usu�rio n�o ganhou nada!");					
				}
			}
		}
		
	}

}
