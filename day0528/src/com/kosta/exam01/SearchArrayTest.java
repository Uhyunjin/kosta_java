import java.util.Scanner;
import java.util.ArrayList;

class NotFoundException extends Exception{
	public NotFoundException(String message){
		super(message); 
	}
}

class SearchArray{
	public SearchArray(int[] arr, int value) throws NotFoundException{
		int i;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(i=0; i<arr.length; i++){
			if(arr[i] == value){
				list.add(i);
			}
		}
		if (list.size()==0)
		{
			throw new NotFoundException("찾고자 하는 데이터는 "+value+" 데이터에 없어요");
		}else{
			System.out.println("찾고자하는 데이터의 인덱스" + list);
		}
	}
}

class SearchArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] data ={10,20,30,40};
		System.out.print("배열에서 찾고자하는 값 입력 ==> ");
		int value = sc.nextInt();
		try{
			new SearchArray(data,value);
		}catch(NotFoundException e){
			System.out.println(e);
		}
	}
}