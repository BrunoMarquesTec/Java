import java.util.Scanner;

public class Vetores {
 
	
public static void main(String[] args) {
	
	String[] tarefas =  new String[5];
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Tarefa 1: ");
	String tarefa1 = scanner.next();
	tarefas[0] = tarefa1;
	
	System.out.print("Tarefa 2: ");
	String tarefa2 = scanner.next();
	tarefas[1] = tarefa2;
	
	System.out.print("Tarefa 3: ");
	String tarefa3 = scanner.next();
	tarefas[2] = tarefa3;
	
	System.out.print("Tarefa 4: ");
	String tarefa4 = scanner.next();
	tarefas[3] = tarefa4;
	
	System.out.print("Tarefa 5: ");
	String tarefa5 = scanner.next();
	tarefas[4] = tarefa5;
	
	for (int i = 0; i < tarefas.length; i++) {
		System.out.println(tarefas[i]);
	}
}	
}
