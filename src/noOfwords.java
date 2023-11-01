import java.util.Scanner;
public class noOfwords {

	public static void main(String[] args) {
		int count=0;
Scanner sc =new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Enter the text:"+s);
{
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!= ' ')
			count++;
	}
}
System.out.println("No.of.Characters"+ count);

	}

}
