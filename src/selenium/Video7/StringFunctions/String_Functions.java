package selenium.Video7.StringFunctions;

import java.io.*;
import java.nio.Buffer;

public class String_Functions {
		int a ;
		static int g= 909;
		
	public static void main(String[] args) throws IOException {
		int ghg =8;
		
		String str = "The rain have started here";
		String str1 = "The rain have started here1";
		//object of string is made in the memory and str is the referenece of that object
		
		
		
		int length = str.length();
		char c = str.charAt(9);
		int index= str.indexOf('e');
		int index1= str.indexOf("e", 3);
		int index2 = str.indexOf("have");

		System.out.println("First occurance of e is---" + index);
		System.out.println("Second occurance of e is---" + index1);
		System.out.println("character at 8th position is---" + c);
		System.out.println("length of string is---" + length);
		System.out.println("Occurance of have is----" + index2);
		boolean result = str.equals(str1);
		System.out.println(result);
		System.out.println(str.substring(0,6));
		System.out.println(str.substring(5,10));
		System.out.println(str.substring(0));
		
		String[]  temp = str.split(" ");
		int length1 = str.split(" ").length; //find no. of words in a sentence
		
			for (int i=0;i<temp.length;i++){
			
				System.out.println(temp[i]);}
				//split based on a word 
				System.out.println("----------------");
		String temp1[] = str.split("have");
		for (int i=0;i<temp1.length;i++){
			
			System.out.println(temp1[i]);
		}
		//convert datatype
			String x = "100";
			int x1 = Integer.parseInt(x);
			System.out.println(x);
			
			int x2 = 100;
			String y = String.valueOf(x2);
			System.out.println(y);
			
			boolean b = Boolean.valueOf("true");
	
		//create file
			File f = new File("F:\\test.txt");
			f.createNewFile();
		
		//file writing
			FileWriter w = new FileWriter("F:\\test.txt");
			BufferedWriter out = new BufferedWriter(w);
			out.write("hello guys");
			out.newLine();
			out.write("hello once again");
			out.flush();
			
		//reading a file
			FileReader r = new FileReader("F:\\test1.txt");
			BufferedReader bfr = new BufferedReader(r);
				/*String str3 = bfr.readLine();
				while (str3!=null){
				System.out.println(str3);
				str3 = bfr.readLine();
				//int i = i+1;
				}
				//or
				String str3 = "";
				while ((str3 =bfr.readLine())!=null){
					System.out.println(str3);
				
				}
				*/
			
			
			for (int p =0;;p++){
			System.out.println(bfr.readLine());
			
			if (bfr.readLine() == null)
				{System.out.println(p);
				break;
				}
			
				}
				
			}
			
	}
		
	

	 



