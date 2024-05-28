class ExceptionTest02
{
	public static void calcDiv(String a,  String b){
		try{
			int r = Integer.parseInt(a)/Integer.parseInt(b);
			System.out.println("나누기 결과 : " + r);
		}catch(Exception e){
			System.out.println("나누기 할 두 수를 확인하세요");
		}
	}

	public static void main(String[] args) 
	{
		calcDiv(args[0], args[1]);
	}
}
