import java.io.IOException;
import java.util.Scanner;


public class guilearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Chatbot.  Please type your first sentenance, not including punctuation:");
		brain one = new brain();
		for(int i = 0; i==0;){
			String s = kb.nextLine().toLowerCase();
			s = s.replace(" ", "");
			if(s.equalsIgnoreCase("quit"))
				one.quit();
			else if(one.knowncheck(s) == true){
				System.out.println(one.knowntalk());
				continue;
			}
			else{
				System.out.println("I'm sorry, I haven't encountered that yet.  Please type an appropriate response: ");
				String ss = kb.nextLine();
				one.remember(ss);
			}
			
		}
	}

}
