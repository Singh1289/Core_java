package date_10_may;

import java.io.*;
import java.util.*;


public class Test2 {
	 public static void main(String[] args) throws FileNotFoundException {
		 
	        Map<String, Integer> wordMap = new HashMap<>();
	        int count = 0;
	        File mi=new File("C:\\Users\\adity\\Desktop\\New folder\\mno.txt");
			Scanner sc= new Scanner(mi);
			String n=null;
			
			while(sc.hasNextLine())
			{
				n=sc.nextLine();
				String[] words = n.split("\\s+");
				for(String word : words)
				{
					word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
	                if (!word.isEmpty()) {
	                	count++;
	                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
	                      
	                }
				}
			}
	        
			System.out.println("   Total Words     :"+count);
			System.out.println("Total Unique Words :"+wordMap.size());
			System.out.println("Word counts:");
			
//	        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
//	            System.out.println(entry.getKey() + ": " + entry.getValue());
//	        }
			 wordMap.forEach((key, value)-> System.out.println(key + " = " + value));
    }
}
