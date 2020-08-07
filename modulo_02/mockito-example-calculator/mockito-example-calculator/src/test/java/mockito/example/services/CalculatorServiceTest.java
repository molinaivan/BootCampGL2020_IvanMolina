/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;


@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorService;
	
	@Mock
	private DataService dataService;
	
	@Mock
	private BasicOperationsService basicOperationService; 
	
	private static int[] listaNumeros;
	
	@BeforeAll
	static void defaultList() {
		listaNumeros = new int[] { 1, 2, 3, 4, 5 };		
	}
	
		
	@Test
	void testCalculateSum() {
		when(basicOperationService.add(1, 3)).thenReturn(4.0);
		assertEquals(4.0, calculatorService.calculateSum(1, 3),.01);
		verify(basicOperationService.add(1.0, 3.0));
	}
	
	@Test
	void testCalculatedSubs() {
		when(basicOperationService.subtract(3, 1)).thenReturn(2.0);
		assertEquals(2.0, calculatorService.calculateSubstraction(3, 1),.01);
		verify(basicOperationService.add(3.0, 1.0));
	}
	
	@Test
	void testCalculatedDiv() throws ZeroDivisionException {
		when(basicOperationService.divide(4, 2)).thenReturn(2.0);
		assertEquals(2.0,calculatorService.calculateDivision(4, 2),.01);
		verify(basicOperationService.add(4.0,2.0));
	}
	
	@Test
	void testCalculateMultiplication() {
		when(basicOperationService.multiply(2, 2)).thenReturn(4.0);		
		assertEquals(8.0, calculatorService.calculateMultiplication(4, 2), .01);
		
		verify(basicOperationService).multiply(4,2);
	}
	
	@Test
	void testCalculateAverage() {
		when(dataService.getListOfNumbers()).thenReturn(listaNumeros);
		when(calculatorService.calculateAverage()).thenReturn(3.0);
		assertEquals(3.0, calculatorService.calculateAverage(), .01);
	}
	
	@Test
	void testGetListOfNumbers() {
		when(dataService.getListOfNumbers()).thenReturn(null);
		
		assertThrows(NullPointerException.class, () -> {
			calculatorService.calculateAverage();
		});
	}
	
	@Test 
	void testDivisionByZeroException() {
		assertThrows(ZeroDivisionException.class,() ->{
			calculatorService.calculateDivision(3, 0);
		});
	}
	
	@Test
	void testPrintResult() {
		when(basicOperationService.add(1, 4)).thenReturn(5.0);
		
		Double result = calculatorService.calculateSum(1, 4);
		assertEquals("El resultado es "+result, calculatorService.printResult(result));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {3,10,21,54,22,67})
	void test(int num) {
		assertTrue(calculatorService.isEven(num));
		
		
	}
	
	@Test
		void testSpy() {
		void testSpyBasicOperationsServiceImpl() {
			BasicOperationsService myOperationsSrv = new BasicOperationsServiceImpl();
			BasicOperationsService spyMyOperationsSrv = spy((myOperationsSrv);
			calculatorService.setBasicOperationsService(spyMyOperationsSrv);
			
			calculatorService.calculateSum(2, 3);
			
			verify(spyMyOperationsSrv).add(2.0, 3.0);	
	}
	
	
}