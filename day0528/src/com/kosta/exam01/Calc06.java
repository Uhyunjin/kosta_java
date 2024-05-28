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
			System.out.println("작업종료");


			
		}catch(ArithmeticException e){
			
			System.out.println("0으로는 나눌 수 없어요!");

		}catch(Exception e){
			
			System.out.println("나누기 할 두 개의 정수를 전달해주세요!");

		}
	}
	// 만약 정상적으로 동작할때는 try안의 맨마지막문장을 동작하여 "작업종료" 출력
	// 그러나 예외의 상황이 되면 해당 catch절을 수행하고 try안의 다음 명령을 동작하지 않는다.
}
