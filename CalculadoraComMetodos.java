import java.util.Scanner;

public class CalculadoraComMetodos {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ImprimirTexto("Digite o primeiro valor, em seguida o operador do cálculo que deseja e depos o ultimo valor. ");
       
        
       //Calculo(vlr1 = scanner.nextDouble();, scanner, scanner);
        
    
        
        	
        }
        
      
	static void Calculo(Scanner vlr1, Scanner operador, Scanner vlr2) {
		
		switch (operador.next()) {
		case "+": System.out.println(vlr1.nextDouble() + vlr2.nextDouble());
		break;
		case "-": System.out.println(vlr1.nextDouble() - vlr2.nextDouble());
		break;
		}
		
	}
        
	
	
	static void ImprimirTexto(String texto) {
		System.out.print(texto);
	}
	
	static void ImprimirNumero(Double numero) {
		System.out.print(numero);
	}
	
	

}
