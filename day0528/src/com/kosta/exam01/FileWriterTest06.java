import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest06	//예외 추적
{
	public static void pro(String fname)throws IOException{

		FileWriter fw = new FileWriter(fname);

		fw.write("hello java");
		fw.close();
		System.out.println("파일을 생성하였습니다");

	}

	public static void main(String[] args) 
	{	
		try{
		pro("c:/daka/hello.txt");
		}catch(IOException e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}