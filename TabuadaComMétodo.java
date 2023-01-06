import java.util.Scanner;

public class TabuadaComMétodo {

	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Digite um número");
		 Integer numero = scanner.nextInt();
		 
		 ImprimirTabuada(numero);
     }
	 
	 
	 static void ImprimirTabuada(Integer numero) {
		 for (int i=0; i <= 10; i++) {
			 int resultado = numero * i;
			 System.out.println(numero + " X " + i + " = " + resultado);
		 }
	 }
}
