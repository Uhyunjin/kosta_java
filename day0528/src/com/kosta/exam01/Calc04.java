//프로그램 실행시에 두 개의 정수를 전달받아 나누기 한 결과를 출력
//java Calc 4 2
class Calc04
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

		}
	}
	// 포함관계에 있는 예외클래스를 사용할때는
	// 자식클래스 먼저 작성 후 부모클래스를 사용해야한다.

}
