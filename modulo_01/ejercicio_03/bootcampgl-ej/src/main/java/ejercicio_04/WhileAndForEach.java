package ejercicio_04;

public class WhileAndForEach {
	public static void main(String[] args) {
		
		System.out.println("respuesta del ejercicio 4.7 : " );
		iteradorWhile(10);
		System.out.println("respuesta del ejercicio 4.8 : " );
		paridad(50);
		
		
	
		
	}
	private static void iteradorWhile(int maximo) {
		int i=1;
		while(i<=maximo) {
			System.out.println("Valor iterador: " + i );
			i++;
						
		}
		
	}
	private static void paridad(int maximo) {
		int i=1;
		while(i<=maximo) {
			
			if(i% 2==0) {
			System.out.println("Valor iterador: " + i + " y es par");
			}
			else {
				System.out.println("Valor iterador: " + i + " y es impar");
			}
			i++;
		}
	}
		
	
	

}
