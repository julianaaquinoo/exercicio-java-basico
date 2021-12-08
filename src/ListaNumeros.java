
public class ListaNumeros {

	public static void main(String[] args) {

		int numeros [] = {1, 5, 8, 7};
		int maiorValor = 0;

		System.out.println(numeros [0] + "\n" + numeros[1] + "\n" + numeros [2] + "\n" + numeros [3]);

		for ( int i = 0; i < 4; i++) {
			if (maiorValor > numeros[i]) {
				maiorValor = maiorValor;

			}else {
				maiorValor = numeros[i];

			}

		}

		System.out.println("O maior valor da Array é " + maiorValor);



	}

}
