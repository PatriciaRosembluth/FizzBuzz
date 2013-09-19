import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testFizzBuzz 
{
	
	FizzBuzz fb;
	
	@Before
	public void setUp()
	{
		fb=new FizzBuzz();
	}

	@Test
	public void testImprimirFizzParaNumero3() 
	{
		assertEquals("Fizz", fb.generar(3));
		
	}
	
	@Test
	public void testImprimeElMismoNumeroSiNoEs3() 
	{
		assertEquals("4", fb.generar(4));
		
	}
	
	@Test
	public void testImprimeFizzSiEsMultiploDe3() 
	{
		assertEquals("Fizz", fb.generar(6));
		
	}
	
	@Test
	public void testImprimirBuzzParaNumero5() 
	{
		assertEquals("Buzz", fb.generar(5));
		
	}
	
	@Test
	public void testImprimeBuzzSiEsMultiploDe5() 
	{
		assertEquals("Buzz", fb.generar(25));
		
	}
	
	@Test
	public void testImprimeFizzBuzzPara15() 
	{
		assertEquals("FizzBuzz", fb.generar(15));
		
	}
	
	@Test
	public void testImprimeFizzBuzzSiEsMultiploDe3y5() 
	{
		assertEquals("FizzBuzz", fb.generar(15));
		
	}
	
	@Test
	public void testImprimeElMismoNumeroSiNoEsMultiploDe3Ni5()
	{
		assertEquals("7", fb.generar(7));
	}
	
	@Test
	public void testImprimeUnaSecuenciaDeNumerosConReglasFizzBuzz()
	{
		String esperado = "1\n"+
						  "2\n"+
						  "Fizz\n"+
						  "4\n"+
						  "Buzz\n"+
						  "Fizz\n";
		assertEquals(esperado, fb.imprimir(6));
	}


}
