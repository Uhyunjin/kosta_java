import java.io.FileWriter;

class FileWriterTest
{
	public static void main(String[] args) 
	{	
		FileWriter fw = new FileWriter("c:/data/hello.txt");
		fw.write("hello java");
		fw.close();
		System.out.println("파일을 생성하였습니다");
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