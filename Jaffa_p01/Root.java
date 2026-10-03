//Package com.java24hours;

class  Root{
	public static void main(String[] arguments)	{
	int len=arguments.length;
	System.out.println(len);
		
		
		
	
		Integer number = Integer.parseInt( arguments [0]);
			System.out.println("Pierwiastek kwadratowy z "
				+ number
				+ " wynosi "
				+Math.sqrt(number)
			);
	}
}
