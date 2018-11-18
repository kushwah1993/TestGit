package java8_Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface WordCount{
	int count(String str);
}
public class Assignment3 {

	public static void main(String[] args) throws IOException {
		WordCount obj = (String str) -> {
			if (str == null || str.isEmpty()){
			 return 0;
			 } 
			String[] words = str.split("\\s+"); 
			return words.length;
		};
		
		System.out.println("Enter a string:");
		String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("Total words: "+obj.count(input));
		
	}

}
