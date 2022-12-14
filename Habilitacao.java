import java.util.Scanner;

public class Habilitacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Idade: ");
		
		final Integer idadeMinima = 18;
		
		Integer idade = scanner.nextInt();
		
		Boolean podeTirar = idade >= idadeMinima;
		
		if (podeTirar) {
			System.out.println("Pode tirar Habilitacao");
		}
		else {
			System.out.println("Idade Insuficiente");
		}
		
		scanner.close();	

	}

}
