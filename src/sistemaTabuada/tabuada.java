package sistemaTabuada;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,result;
		
		System.out.println("Manda o número que vc quer saber a tabuada(que vai de 0 à 9)");
		n=sc.nextInt();
		
		for(int i = 0;i<10;i++) {
			result = n*i;
			System.out.println(n + " x "+ i + " = "+result);
		}

		sc.close();
	}

}
