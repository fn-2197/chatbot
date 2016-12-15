import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class brain {
private String a[] = new String[1000];
private String input;
private int index;
private int lastadded = 0;
private String ina[] = new String[1000];


	public brain() throws IOException{	
		for(int i = 0; i < a.length; i++ ){
			a[i] = "";
			
		}
		int maxIndx = -1;
		Scanner sf = new Scanner(new File("F:\\brain.txt"));
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();
			ina[maxIndx] = a[maxIndx];
		}
		sf.close();
	}
	
	public boolean knowncheck(String s){
		String in = s;
		input = s;
		boolean known = false;
		for(int i = 0; i<a.length; i++){
		if(a[i].equals("")){
			continue;
		}
			if(getfirst(a[i]).equals(in)){
				known = true;
				index = i;
				break;
				}
		
		}
		return known;
		}
	public String knowntalk(){
		return getsecound(a[index]);
	}
	public void remember(String s){
		a[lastadded] = input + "=" + s;
		lastadded++;
	}
	public boolean quit() throws IOException{
		FileWriter fw = new FileWriter("E:\\brain.txt", true);
		PrintWriter output = new PrintWriter(fw, true);
		output.println();
		for(int i = 0; i<a.length; i++){
			if(a[i] != null & a[i] != "" & !(a[i].equals(ina[i])))
			output.println(a[i]);
			
		}
		output.close();
		fw.close();
		return true;
	}
	private String getfirst(String s){
		String in = s;
		for(int i = 0; i <= in.length(); i++){
			if('=' == in.charAt(i))
				return in.substring(0, i);
		}
		return null;
	}
	private String getsecound(String s){
		String in = s;
		for(int i = 0; i <= in.length(); i++){
			if('=' == in.charAt(i))
				return in.substring(i+1);
		}
		return null;	
	}
	
}
