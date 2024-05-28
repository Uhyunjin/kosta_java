import java.util.Scanner;
class HarmonicMeanTest 
{	//
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, mean;

		System.out.println("첫번째 수 입력 : ");
		a = sc.nextInt();

		System.out.println("두번째 수 입력 : ");
		b = sc.nextInt();

		mean = (2*a*b) /(a+b);
		System.out.println("두 수의 조화평균은 " +mean);
	}
}
