class ExceptionTest01 
{
	public static void calcDiv(String a,  String b){
		int r = Integer.parseInt(a)/Integer.parseInt(b);
		System.out.println("나누기 결과 : " + r);
	}

	public static void main(String[] args) 
	{
		calcDiv(args[0], args[1]);
	}
}
