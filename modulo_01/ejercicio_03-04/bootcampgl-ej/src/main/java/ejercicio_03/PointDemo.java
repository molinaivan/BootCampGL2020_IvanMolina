package ejercicio_03;

public class PointDemo {
	public static void main(String[] args) {
		VariableInstancia vI = new VariableInstancia();
		vI.setEngPoints(50);
		vI.setMathsPoints(80);
		
		System.out.println("El resultado es : EngPoints = " + vI.getEngPoints() + " , MathPoints = " + vI.getMathsPoints());
		
	}

}
