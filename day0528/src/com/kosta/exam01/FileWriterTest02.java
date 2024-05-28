import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest02
{
	public static void main(String[] args) 
	{	
		try{
			//FileWriter fw = new FileWriter("c:/data/hello.txt");
			FileWriter fw = new FileWriter("c:/daka/hello.txt");

			fw.write("hello java");
			fw.close();
			System.out.println("파일을 생성하였습니다");
		}catch(IOException e){
			System.out.println("Exception : "+e);
			// 예외 객체로부터 메세지 전달받기
		}
	}
}

/*
FileWriterTest.java:7: error: unreported exception IOException; must be caught or declared to be thrown
                FileWriter fw = new FileWriter("c:/data/hello.txt");
                                ^
FileWriterTest.java:8: error: unreported exception IOException; must be caught or declared to be thrown
                fw.write("hello java");
                        ^
FileWriterTest.java:9: error: unreported exception IOException; must be caught or declared to be thrown
                fw.close();
                        ^
3 errors

*/