package actividad02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author Raúl Gutiérrez Cecilia
 * @Asignatura DAW M05
 */

public class TestStack {
	
	@SuppressWarnings("unused")
	private Stack stackConElementos;
	@SuppressWarnings("unused")
	private Stack stackSinElementos;
	
	@Before
	public void setUp() throws Exception {
		//configurar el test
	}
	
	@Test
	public void testStackVacio() {
		stackSinElementos = new Stack();
		boolean res = stackSinElementos.stackVacio();
		assertEquals(true, res);	
	}
	
	@Test
	public void testApilar() {
		stackConElementos = new Stack();
		stackConElementos.apilar(5);
		assertNotNull(stackConElementos);
	}

	@Test
	public void testDesapilarStackSinElementos() {
		stackSinElementos = new Stack();
		Object res = new Object();
		res = stackSinElementos.desapilar();
		assertEquals(null, res);
	}
	
	@Test
	public void testDesapilarStackConElementos() {
		int valor = 5;
		stackConElementos = new Stack();
		stackConElementos.apilar(valor);
		int res = stackConElementos.desapilar();
		assertEquals(valor,res);
	}

	@Test
	public void testGetNumElements() {
		stackConElementos = new Stack();
		stackConElementos.apilar(5);
		int res = stackConElementos.getNumElements();
		assertEquals(1, res);
	}
}