package ejercicio_04;


public class FlujosForEach {
	public static void main(String[] args) {
		
		System.out.println("respuesta del ejercicio 4.9 : " );
		iterarArrayI();
		System.out.println("respuesta del ejercicio 4.10 : " );
		mostrarDias();
		System.out.println("respuesta del ejercicio 4.11 : " );
		mostrarCaracter();
	}
	private static void iterarArrayI() {
		
		Integer[] creciente= {1,2,3,4,5,6,7,8,9,10};
			for(Integer x: creciente) {
				creciente[x-1]=x;
	
							
				System.out.println("valor iterado " + creciente[x-1] );
				
			}
		}
		
	
	private static void mostrarDias() {
		String[] dias ={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		for(String dia:dias) {
			System.out.println("Dia de la semana : " + dia );
			
		}
	}
	
	private static void mostrarCaracter() {
		String palabra = "BootCamp 2020";
		char[] letters = palabra.toCharArray();
		for(char letter : letters) {
			System.out.println("Letra: " + letter);
		}
		

		
	}
	
	

}
