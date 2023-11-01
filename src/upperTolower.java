import java.util.*;
import java.util.Random;
public class upperTolower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> words=new ArrayList();
		words.add("Google");
		words.add("Yahoo");
		words.add("YouTube");
		words.add("Gmail");
		System.out.println(words);
		Random rand =new Random();
		String wrd=words.get(rand.nextInt(words.size()));
		System.out.println(wrd);
		
		List<Character>playerGuess=new ArrayList();
		printWord(wrd,playerGuess);
	//	while(true)
		//{
	//		getPlayerGuess(sc,wrd,playerGuess);
		//}
	//}
		//private static void getPlayerGuess(Scanner sc,String wrd,List<Character>playerGuess)
		System.out.println("Enter the letter!!!");
		String letter=sc.nextLine();
		playerGuess.add(letter.charAt(0));
		printWord(wrd,playerGuess);
	}
		//private static void printWord(String wrd,List<Character>playerGuess)
		//for(int i=0;i<wrd.length();i++)
		/*{
			if( playerGuess.contains(wrd.charAt(i)))
			{
				System.out.print(wrd.charAt(i));
			}
			else
			{
				System.out.print("-");

			}
		}
		System.out.println();*/
	
		

	}


