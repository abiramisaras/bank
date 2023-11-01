import java.util.Scanner;
public class stringPermutation {
	static void permutation(char[]arr,int fi)
	{
		if(fi==arr.length-1)
		{
			System.out.println(arr[i]);
			return;
		}
		for(int i=fi;i<a.length;i++)
		{
		swap(arr,i,fi);
		permutation(arr,fi+1);
		swap(arr,i,fi);
	}
	}
	static void swap(char[]arr,int i,int fi)
	{
		char temp[]=arr[i];
		arr[i]=arr[fi];
		arr[fi]=temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permutation(s.toCharArray(),0);

	}

}
