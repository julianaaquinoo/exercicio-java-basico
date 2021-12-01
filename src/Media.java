import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		String nome = "";
		double primeiraNota = 0;
		double segundaNota = 0; 
		double terceiraNota = 0;
		double quartaNota = 0;
		
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
		System.out.println("Digite a primeira nota: ");
		primeiraNota = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		segundaNota = input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		terceiraNota = input.nextDouble();
		System.out.println("Digite a quarta nota: ");
		quartaNota = input.nextDouble();
		
		System.out.println("A média das notas de matemática do " + nome + " é " + (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4);


		
		
		input.close();
		
		
	}

}
