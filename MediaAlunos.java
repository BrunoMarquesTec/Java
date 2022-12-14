import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a média do aluno:  ");
		Double media = scanner.nextDouble();
		
		Boolean resultado = media >= 7.0;
		
		if(resultado) {
			System.out.println("Aprovado! Parabéns!");
		}
		else {
			System.out.println("Reprovado! Muito Burro!");
		}
	}

}
