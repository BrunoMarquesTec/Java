import java.util.Scanner;

public class CalcularTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor pago: ");
		Double ValorPago = scanner.nextDouble();
		
		
		Double Resultado = ValorPago - valorProduto;
		
		if (Resultado <= 0) {
			
			System.out.println("Nao precisa de  troco!!");
		}
		else {
			System.out.println("Troco: " + Resultado);
		}
			
		
	}

}
