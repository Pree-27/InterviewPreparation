import java.io.InputStream;
import java.util.Scanner;

public class StringPalindrome {
        public static void main(String[] args) 
          {
	          Scanner sc= new Scanner(System.in);
	         String StringToCheckpalindrome =sc.next();
	         String  reverseStr = "";
	         int strLength = StringToCheckpalindrome.length();
	         for (int i = strLength - 1; i >=0; --i) {
	             reverseStr = reverseStr + StringToCheckpalindrome.charAt(i);
	           }

	           if (StringToCheckpalindrome.toLowerCase().equals(reverseStr.toLowerCase())) {
	             System.out.println(StringToCheckpalindrome + " is a Palindrome String.");
	           }
	           else {
	             System.out.println(StringToCheckpalindrome + " is not a Palindrome String.");
	           }
	         
         }
        }