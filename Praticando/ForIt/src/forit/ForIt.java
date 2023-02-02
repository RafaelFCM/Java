package forit;

import java.util.Arrays;
import java.util.Scanner;

public class ForIt {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num[] = {3,7,2,1,8,9,4};
		for (int i:num) {
			System.out.print(i+" ");
		}
		System.out.println();
		int p = Arrays.binarySearch(num,2);
		System.out.println("Encontrei o valor na posição: "+p);
	}

}
