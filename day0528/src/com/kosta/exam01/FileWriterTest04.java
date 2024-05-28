import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest04
{
	public static void pro(String fname){
		try{
			FileWriter fw = new FileWriter(fname);

			fw.write("hello java");
			fw.close();
			System.out.println("파일을 생성하였습니다");

		}catch(IOException e){
			System.out.println("Exception : "+e);
		}
	}

	public static void main(String[] args) 
	{	
		pro("c:/daka/hello.txt");
	}
}