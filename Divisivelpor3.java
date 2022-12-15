
public class Divisivelpor3 {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int total = 0;
		
		for(int i =1;i < numeros.length; i++) {
			
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
