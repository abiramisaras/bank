
public class CountVowCon {

	public static void main(String[] args) {
String str=" saraswathi is 21 year old.";
int vcount=0;
int concount=0;
int digcount=0;
int space=0;
int splcount=0;

str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		vcount++;
	}
	else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
	{
		concount++;
	}
	else if(str.charAt(i)>='0' && str.charAt(i)<='z')
	{
		digcount++;
	}
	else if(str.charAt(i)==' ')
	{
		space++;
	}
	else
	{
		splcount++;
	}
	
}
System.out.println("NO.of Vowels"+ vcount);
System.out.println("NO.of Consonants"+ concount);
System.out.println("NO.of digitcount"+ digcount);
System.out.println("NO.of space"+ space);
System.out.println("NO.of Spl char"+ splcount);


	}

}

