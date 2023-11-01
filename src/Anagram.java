import java.io.*;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args)throws IOException {
InputStreamReader sc = new InputStreamReader(System.in);
BufferedReader r =new BufferedReader(sc);
String str1 =r.readLine();
String str2=r.readLine();
str1=str1.replace(" ","");
str2=str2.replace(" ","");

str1=str1.toLowerCase();
str2=str2.toLowerCase();

char a[]=str1.toCharArray();
char b[]=str2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);

if(Arrays.equals(a,b))
{
	System.out.println("It is an Anagram");

}
else
{
	System.out.println("It is not an Anagram");

}
	}

}
