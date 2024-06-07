package estudos;

import java.util.Random;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();

		int aposComp[] = new int[61];
		int apos[] = new int[6];
		int sorteado[] = new int[6];

		int acertos = 0;

		for (int i = 1; i < 7; i++) {
			System.out.print(i + "º número que apostou: ");
			apos[i] = entrada.nextInt();
		}

		for (int j = 1; j < 61; j++) {
			if (j == apos[1] || j == apos[2] || j == apos[3] || j == apos[4] || j == apos[5] || j == apos[6]) {
				aposComp[j] = 1;
			} else
				aposComp[j] = 0;
		}

		for (int i = 1; i < 7; i++) {
			sorteado[i] = random.nextInt(6) * 60 + 1;
		}

		for (int i = 1; i < 61; i++) {
			if (i == sorteado[i] && aposComp[i] == 1) {
				acertos++;
			}
		}

		System.out.println("");
		System.out.println("");

		if (acertos == 6) {
			System.out.println("Resultado: Acertos= " + acertos + " - Usuário fez uma SENA!");
		} else if (acertos == 5) {
			System.out.println("Resultado: Acertos= " + acertos + " - Usuário fez uma QUINA!");
		} else if (acertos == 4) {
			System.out.println("Resultado: Acertos= " + acertos + " - Usuário fez uma QUADRA!");
		} else {
			System.out.println("Resultado: Acertos= " + acertos + " - Usuário não ganhou nada!");
		}

	}
}
