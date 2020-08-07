package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
class LoteriaTest {
	
	
	
	
	Loteria loteria;
	@InjectMocks
	CartonGenerator cartonGeneratorMock;
	
	@Mock
	Random rand;
	
	
	
	@Test
	void WhenJugadaExcepcionalThenOK() {
		
		
		Mockito.when(rand.nextInt()).thenReturn(1,0,1,1,1,0);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorMock);
		loteria.jugada();
		
		assertFalse(loteria.hayGanadorUnico());   
		assertTrue(loteria.hayCuadrupleGanador()); 
	}	
	
	@Test
	void GanadorUnicoTest() {
		Mockito.when(rand.nextInt()).thenReturn(1,0);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorMock);
		loteria.jugada();
		
		assertTrue(loteria.hayGanadorUnico());  
		
	}
	@Test
	void getPozoBoletosTest() {
		float pozo = 1000000;
		int boletos= 300;
		
		loteria = new Loteria(pozo,boletos, cartonGeneratorMock);
		
		assertEquals(pozo + boletos, loteria.getPozo() + loteria.getBoletos());
		
	}
	
	@Test
	void getGanadoresTest() {
		float pozo = 1000000;
		int boletos= 300;
		
		
		
		loteria = new Loteria(pozo,boletos, cartonGeneratorMock);
		
		loteria.jugada();	
		
		assertNotNull(loteria.getGanadores());
		
	}
	
	
	
	
	
	
	@Test
	void cuadrupleGanadorTest() {
		
		float pozo = 1000000;
		int boletos= 300;
		
		
		loteria = new Loteria(pozo,boletos, cartonGeneratorMock);
		loteria.jugada();
		
		assertFalse(loteria.hayCuadrupleGanador());
		
	}
	
	
	
	
	
	

}
