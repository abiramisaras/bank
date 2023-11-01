import java.io.*;
public class DivideEqualParts {

	public static void main(String[] args)throws IOException {
InputStreamReader c=new InputStreamReader(System.in);
BufferedReader d=new BufferedReader(c);
String str1 =d.readLine();
int n=2;
int len=str1.length();
int n1=len/n;

System.out.println("Enter the string:"+str1);
System.out.println("Enter the no.of parts to be divided"+n);

if(len % n !=0)
{
    System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  

}
else
	for(int i=0;i<n;i++)
	{
		String s=" ";

		for(int j=n1*i;j<(i+1)*n1;j++)
		{
			s=s+str1.charAt(j);
		}
		System.out.println(s);

	}





	}

}
