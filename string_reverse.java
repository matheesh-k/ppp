import java.util.*;
public class string_reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the string u want to reverse");
		Scanner in=new Scanner(System.in);
		String mathi=in.nextLine();
		char arr[]= mathi.toCharArray();
		System.out.println("the reversed string:");
		for(int j=arr.length-1;j>=0;j--){
			System.out.print(arr[j]);
			
		}
		// TODO Auto-generated method stub
	}

	}


