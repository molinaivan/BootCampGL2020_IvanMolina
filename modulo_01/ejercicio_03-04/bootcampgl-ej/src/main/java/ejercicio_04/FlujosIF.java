package ejercicio_04;

public class FlujosIF {
	
	public static void main(String[] args) {
		System.out.println("respuesta del ejercicio 4.1 : " );
		mayorDiez(3,10);
		System.out.println("respuesta del ejercicio 4.2 : " );
		tamañoLetra('A');
		tamañoLetra('b');
		
		System.out.println("respuesta del ejercicio 4.3 : " );
		compraCliente(400);
		
		
		
		

	}
	private static void mayorDiez(int a, int b ) {
		if (a+b <= 10) {
			System.out.println("La suma de los numeros es: " + (a+b));
		}else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}

		
	}
	
	private static void tamañoLetra(char letra) {
		if (Character.isUpperCase(letra)) {
			System.out.println("La letra ingresada ( '"+ letra+ "' ) es mayuscula");
		}
		else {
			System.out.println("La letra ingresada ('" + letra + "') es minuscula");
		}
		
		
	}
	
	private static void compraCliente(double compra) {
		
		double precioFinal;
		double descuento;
		if (compra==300) {
			descuento=0.2;	
			precioFinal = compra*(1-descuento);
			
			System.out.println("El descuento que obtiene por su compra es del : %" +
			
			descuento*100 + " ( $" + compra*descuento + " ), quedando a un precio final de : $" + 
			precioFinal );
		}else if (compra>350) {
			
			descuento=0.25;
			precioFinal = compra*(1-descuento);
			
			System.out.println("El descuento que obtiene por su compra es del : %" + 
			descuento*100 + " ( $" + compra*descuento +
			" ), quedando a un precio final de : $" + precioFinal );
		}else {
			System.out.println("no hay descuento , su precio final es :" + compra);
			descuento=0;
			 
		}
		
	}

}
