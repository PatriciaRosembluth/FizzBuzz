import static org.junit.Assert.*;

import org.junit.Test;


public class testFizzBuzz {

	@Test
	public void testImprimirFizzParaNumero3() 
	{
		FizzBuzz fb=new FizzBuzz();
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


}
