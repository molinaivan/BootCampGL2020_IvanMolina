/**
 * 
 */
package mockito.example.services.impl;

import exceptions.ZeroDivisionException;
import mockito.example.services.BasicOperationsService;
import mockito.example.services.CalculatorService;
import mockito.example.services.DataService;

public class CalculatorServiceImpl implements CalculatorService {
	private DataService dataService;
	private BasicOperationsService basicOperationsService;

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		return this.dataService;
	}

	@Override
	public double calculateSum(int a, int b) {
		return basicOperationsService.add(a, b);
	}

	@Override
	public double calculateSubstraction(int a, int b) {
		return basicOperationsService.subtract(a, b);
	}
	
	@Override
	public double calculateDivision(int a, int b) throws ZeroDivisionException {
		
		if(b==0) {
			throw new ZeroDivisionException("No se puede dividir por cero");
		}
		return basicOperationsService.divide(a, b);		
	}

	@Override
	public double calculateMultiplication(int a, int b) {
		return basicOperationsService.multiply(a, b);	
	}
	
	@Override
	public double calculateAverage() {
		int[] numbers = this.getDataService().getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	@Override
	public boolean isOdd(int a) {
		// TODO implement me
		return false;
	}

	@Override
	public String printResult(double result) {
		String textToDisplay = "El resultado es: " + result;
		System.out.print(textToDisplay);
		return textToDisplay;
	}
	@Override
	public boolean isEven(int number) {
		int even = number%2 ;
		return (even==0.0);
	}
	
	
}
