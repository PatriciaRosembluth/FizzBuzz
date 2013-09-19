
public class FizzBuzz
{
	private static final int _Fizz=3;
	private static final int _Buzz=5;
	private static final String _MENSAJE_FIZZBUZZ = "FizzBuzz";
	private static final String _MENSAJE_BUZZ = "Buzz";
	private static final String _MENSAJE_FIZZ = "Fizz";


	public String generar(int numero) 
	{
		if(esMultiploDe(numero, _Fizz)&&esMultiploDe(numero, _Buzz))
			return _MENSAJE_FIZZBUZZ;
		if(esMultiploDe(numero, _Fizz))
			return _MENSAJE_FIZZ;
		if(esMultiploDe(numero, _Buzz))
			return _MENSAJE_BUZZ;
		
		return Integer.toString(numero);

	}
	
	private boolean esMultiploDe(int numero, int multiplo)
	{
		return numero % multiplo == 0;
	}

	
	public String generar2(int numero) 
	{
		if(numero%3==0 && numero%5==0)
			return "FizzBuzz";
		else
		{
				return Integer.toString(numero);
		}
	}

}
