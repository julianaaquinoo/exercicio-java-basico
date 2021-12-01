import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		String nome = "";
		int idade =	0;
		String cidade = "";
		
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		input.nextLine();
		System.out.println("Digite sua cidade: ");
		cidade = input.nextLine();

		System.out.println("O(A) " + nome + " tem " + idade + " anos e mora em " + cidade);
		
		
		input.close();
		
	}

}
