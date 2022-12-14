import java.util.Scanner;

public class CalculaFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor do produto: ");
		
		Double valorProduto = scanner.nextDouble();
		
		final Double frete = 15.00;
		
		if (valorProduto >= 100.00) {
			System.out.println("O valor final é: " + (valorProduto + frete));
		}
		else {
			System.out.println("O valor final do produto é: " + valorProduto);
		}
		
		scanner.close();

	}

}
