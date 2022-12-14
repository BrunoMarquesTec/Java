import java.util.Scanner;

public class Pagamentos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto:  ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o numero do tipo de pagamento:   1 = a vista / 2 = a prazo:  ");
		Double tipoPagamento = scanner.nextDouble();
		
		Boolean PagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if(!PagamentoAVista) {
		    juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros /100;
		
		Double ValorTotal = valorProduto + acrescimo;
		
		System.out.println("Valor a Pagar: " + ValorTotal);
		
		scanner.close();
	}

}
