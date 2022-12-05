package sistemaTabuada;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result;
		
		System.out.println("Tabuada do 0 ao 9:");
		
		for(int i = 0;i<10;i++) {
			for(int j=0;j<=10;j++) {
				result=j*i;
				System.out.println(i + " x "+ j + " = "+result);
			}
			System.out.println("");
		}

		sc.close();
	}

}
