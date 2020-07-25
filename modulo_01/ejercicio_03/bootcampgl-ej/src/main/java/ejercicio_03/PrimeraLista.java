package ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {
	public static void main (String[] args) {
		List<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println("mi lista:" +letters); 
		System.out.println("mi lista tiene: " +letters.size()+ " elementos");
		letters.add(0, "X");
		System.out.println("mi nueva lista:" +letters); 
		
		
		
	}

}
