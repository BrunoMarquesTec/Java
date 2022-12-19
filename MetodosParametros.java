import java.util.Scanner;

public class MetodosParametros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ImprimirTraco();
		
		String[] cursos = new String[] {"Java", "Spring", "Java avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo :");
		
		for (int i = 0; i < cursos.length; i++) {
			
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("Qual curso voce escolheu? ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			SairSistema();
		}
		
		ImprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartao", "Boleto"};
		
		System.out.println("Escolha a forma de pagamento: ");
		
		for (int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}
		
			System.out.print("Digite a forma escolhida: ");
			Integer posicaoPagamento = scanner.nextInt();
			
			posicaoValida = posicaoPagamento >= 0 && posicaoPagamento < formasPagamento.length;
			
			if (!posicaoValida) {
				SairSistema();
			}
			
			String cursoEscolhido = cursos[posicaoCursoEscolhido];
			String formaPagamentoEscolhido = formasPagamento[posicaoPagamento];
			
			ImprimirTraco();
			
			System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento escolhida foi: " + formaPagamentoEscolhido);
			
			//scanner.close();		

	}
	
	   static void ImprimirTraco() {
		   System.out.println("----------------------------------");
	   }
	   
	   
	   static void SairSistema() {
		   System.out.println("Escolha Invalida");
		   System.exit(1);
	   }

}
