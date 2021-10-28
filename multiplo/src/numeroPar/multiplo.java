package numeroPar;

import java.util.Scanner;

public class multiplo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		 Scanner sc = new Scanner(System.in);
		 System.out.println("introduce un numero:");
		 int numero = sc.nextInt();
		
		 int  resto =numero%2;
		 while (resto==0 & numero>2) {
			
			 numero=numero/2;
			 resto=numero%2;
			 System.out.println(numero);
		 }	 
		 if (resto!=0) {
				 System.out.println("el numero no es multiplo de 2");
		 }else 
			 	System.out.println("el numero es multiplo de 2");
		 
	}

}
