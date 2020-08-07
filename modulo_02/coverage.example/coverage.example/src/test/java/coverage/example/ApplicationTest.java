package coverage.example;

import org.junit.jupiter.api.Test;

class ApplicationTest {
	Application app = new Application();

	@Test
	void testMain() {
		Application.main(null);
		app.main(null);
		
		
	}
	
}