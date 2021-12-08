import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		int maiorValor = 0;
	    ArrayList<Integer> numeros = new ArrayList<Integer>();

		Scanner input = new Scanner (System.in);

		System.out.println("Digite um numero: ");
		numeros.add(input.nextInt());
		input.nextLine();

		System.out.println("Digite um numero: ");
		numeros.add(input.nextInt());
		input.nextLine();

		System.out.println("Digite um numero: ");
		numeros.add(input.nextInt());
		input.nextLine();

		System.out.println("Digite um numero: ");
		numeros.add(input.nextInt());
		input.nextLine();


		System.out.println("Lista de numeros:");

		for ( int i = 0; i < numeros.size(); i++) {
			
				System.out.println(numeros.get(i));
			}
		
		for ( int i = 0; i < 4; i++) {
			if (maiorValor > numeros.get(i)) {
				maiorValor = maiorValor;

			}else {
				maiorValor = numeros.get(i);
				

			}


		}

		System.out.println(maiorValor);

		
		}
			
			


		}
		
		


