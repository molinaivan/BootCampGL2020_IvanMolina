package ejercicio_04;

public class FlujosFor {
public static void main(String[] args) {
	
	System.out.println("respuesta del ejercicio 4.4 : " );
	iterar10();
	System.out.println("respuesta del ejercicio 4.5 : " );
	contadorDiv20(10000);
	System.out.println("respuesta del ejercicio 4.6 : " );
	diaSemana();
	
		
		

	
	}
	private static void iterar10() {
		for (int i=1; i<=10; i++) {
			System.out.println("valor iterador:" + i);
		}
	}
	
	private static void contadorDiv20(int maximo) {
		int contador=0;
		for (int i=1; i<=maximo; i++) {
			if(i %20 == 0) {
			contador= contador+1;			
			}			
		}
		System.out.println("cantidad de n° divisibles por 20 en " + maximo + 
		" ="+ contador );
	}
	
	private static void diaSemana() {
		String[] dias ={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		int cantDias= dias.length;
		
		for (int i=1; i<= cantDias; i++) {
		System.out.println("Dia de la semana: " + dias[i-1] );
		}
			
		
	}

}
	
