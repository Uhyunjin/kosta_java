import java.util.Scanner;
class HarmonicMeanTest02 
{	//조화평균이 있을 수 없는 사용자 정의 예외를 만들기

	public static class NotHarmonicMeanException extends Exception
	{
		public NotHarmonicMeanException(String exceptionMessage){
			super(exceptionMessage);
			//자바는 모르고 있는 예외상황을 강제로 만들어준다
		}
	}
	public static void main(String[] args) 
	{
		try{
			Scanner sc = new Scanner(System.in);
			int a, b, mean;

			System.out.println("첫번째 수 입력 : ");
			a = sc.nextInt();

			System.out.println("두번째 수 입력 : ");
			b = sc.nextInt();

			if (a==-b)
			{
				throw new NotHarmonicMeanException(a+"와 "+b+"의 조화평균은 있을 수 없어요");
			}

			mean = (2*a*b) /(a+b);

			System.out.println("두 수의 조화평균은 " +mean);
		}catch(NotHarmonicMeanException e){
			System.out.println("NotHarmonicMeanException : "+e.getMessage());
		}
	}
}
