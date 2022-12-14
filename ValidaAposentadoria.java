import java.util.Scanner;

public class ValidaAposentadoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer idadeMinima = 55;
		final Integer tempoContribuido = 25;
		
		System.out.print("Digite a Idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite o tempo contribuido: ");
		Integer tempo = scanner.nextInt();
		
		Boolean PodeAposentar = idade >= idadeMinima && tempo >= tempoContribuido;
		
		if (PodeAposentar) {
			System.out.println("Ja pode aposentar!!");
		}
		else {
			System.out.println("Ainda não pode aposentar!!");
		}
		
		scanner.close();

	}

}
