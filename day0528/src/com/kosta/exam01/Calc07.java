//프로그램 실행시에 두 개의 정수를 전달받아 나누기 한 결과를 출력
//java Calc 4 2
class Calc06
{
	public static void main(String[] args) 
	{
		try{
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과 : "+div);			
			
		}catch(ArithmeticException e){
			
			System.out.println("0으로는 나눌 수 없어요!");

		}catch(Exception e){
			
			System.out.println("나누기 할 두 개의 정수를 전달해주세요!");

		}finally{
			System.out.println("작업종료");

		}
	}
	// 정상적으로 동작하거나 예외가 발생하거나에 상관없이
	// 무조건 동작해야하는 명령은 finally를 사용한다.
}
