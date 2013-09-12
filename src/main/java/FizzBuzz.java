
public class FizzBuzz
{

	public String generar(int numero) 
	{
		if(numero%3==0)
			return "Fizz";
		else
		{
			if(numero%5==0)
				return "Buzz";
			else
				return Integer.toString(numero);
		}
	}
	

}
