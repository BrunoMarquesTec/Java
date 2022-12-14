import java.util.Scanner;

public class SomaDasContas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Contas do mes: \n"
				+ "Agua: \n"
				+ "Luz: \n"
				+ "Escola: \n"
				+ "Mercado: \n"
				+ "Cartão: \n");
		
		Double agua = scanner.nextDouble();
		Double luz = scanner.nextDouble();
		Double escola = scanner.nextDouble();
		Double mercado = scanner.nextDouble();
		Double cartao = scanner.nextDouble();
		
		Double contas =  agua + luz + escola + mercado + cartao; 
				
		
		System.out.println("O valor das contas do mes, total é: " + contas);

	}

}
