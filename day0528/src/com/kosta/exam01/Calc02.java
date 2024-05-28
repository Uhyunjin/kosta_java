//프로그램 실행시에 두 개의 정수를 전달받아 나누기 한 결과를 출력
//java Calc 4 2
class Calc02
{
	public static void main(String[] args) 
	{
		try{
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과 : "+div);
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("나누기 할 두 수를 전달해주세요!");

		}catch(ArithmeticException e){
			
			System.out.println("0으로는 나눌 수 없어요!");

		}catch(NumberFormatException e){
			
			System.out.println("숫자로 입력해주세요!");

		}
	}
	// 만약 프로그램 실행시에 다음과 같이 두 개의 정수를 전달하지 않거나 부적합한 값을 전달하게 되면 
	// 프로그램 실행시에 예기치 않은 오류를 만나게 된다.

}
