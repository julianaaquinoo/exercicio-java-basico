import java.util.ArrayList;
import java.util.Scanner;

public class ExerciciosArrayList {


	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		Scanner input = new Scanner (System.in);


		System.out.println("Digite seu nome: ");
		nomes.add(input.nextLine());
		System.out.println("Digite seu nome: ");
		nomes.add(input.nextLine());
		System.out.println("Digite seu nome: ");
		nomes.add(input.nextLine());
		System.out.println("Digite seu nome: ");
		nomes.add(input.nextLine());


		System.out.println("Lista de nomes");

		for ( int i = 0; i < nomes.size(); i++) {


			System.out.println(nomes.get(i));
			
						
		}

		System.out.println("Digite seu nome: ");
		nomes.set(0,input.nextLine());
		System.out.println("Digite seu nome: ");
		nomes.set(1,input.nextLine());
		
		for ( int i = 0; i < nomes.size(); i++) {

			System.out.println(nomes.get(i));
		}
		input.close();
	}


}

