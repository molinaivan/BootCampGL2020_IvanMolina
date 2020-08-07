package com.globallogic.bootcampgl.junitTest;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest extends App {
	
	

	@Test
	void test() {
		assertEquals("Test","Test");
	}
	
	@Test
	void test1() {
		String A,B,C;
		A="una cosa";
		B="una cosa";
		C="otra cosa";
	  
	    assertTrue(A!=C  && A.equals(B) );
	    fail("lo hago fallar");
			
		
	}
	@Test
	void test0103() {
		assertTrue(25>12);
		assertFalse(25>27);
		fail("Lo hago fallar");
	}
	
	@Test
	void test0104() {
		Long J=null;
		assertNull(J);
		J=1L;
		assertNotNull(J);
		fail("Lo hago fallar");
		
	}
	
	@Test
	void test0106() {
		
		int esperado = 5;
		int resultado = App.sumarInt(1, 4);
		assertEquals(resultado,esperado,"El resultado está mal");
				
	}
	
	@Test
	void test0107() {
		
		assertTrue(unoSiete(7),"Esta variable no es true: ");
		assertFalse(unoSiete(2),"Esta variable no es false");
	}
	
	
}
