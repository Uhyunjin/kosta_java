class ExceptionTest03
{
	public static void calcDiv(String a,  String b)throws ArithmeticException{
			int r = Integer.parseInt(a)/Integer.parseInt(b);
			System.out.println("나누기 결과 : " + r);
	}

	public static void main(String[] args) 
	{	
		try{
		calcDiv(args[0], args[1]);
		}catch(ArithmeticException e){
			System.out.println("예외 발생 : "+e.getMessage());
		}
	}
}
