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
	public void GenerarFizzParaNumero3() 
	{
		assertEquals("Fizz", fb.generar(3));
		
	}
	
	@Test
	public void testImprimeElMismoNumeroSiNoEs3() 
	{
		FizzBuzz fb=new FizzBuzz();
		assertEquals("4", fb.generar(4));
		
	}
	
	@Test
	public void testImprimeFizzSiEsMultiploDe3() 
	{
		FizzBuzz fb=new FizzBuzz();
		assertEquals("Fizz", fb.generar(6));
		
	}
	
	@Test
	public void testImprimirBuzzParaNumero5() 
	{
		FizzBuzz fb=new FizzBuzz();
		assertEquals("Buzz", fb.generar(5));
		
	}
	
	@Test
	public void testImprimeBuzzSiEsMultiploDe5() 
	{
		FizzBuzz fb=new FizzBuzz();
		assertEquals("Buzz", fb.generar(25));
		
	}
	
	@Test
	public void testImprimeFizzBuzzSiEsMultiploDe3y5() 
	{
		FizzBuzz fb=new FizzBuzz();
		assertEquals("FizzBuzz", fb.generar2(15));
		
	}

}
