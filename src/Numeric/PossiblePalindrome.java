package Numeric;

public class PossiblePalindrome {
public static void main(String[] args) {
	String input="malayalamg";
	String first="";
	String second="";
	String str="";
	char c = 0;
	
	for(int i=0;i<input.length();i++)
	{
		first=input.substring(0,i);
		second=input.substring(i+1);
		str=first+second;
		StringBuffer sb=new StringBuffer(str);
		if(sb.reverse().toString().equalsIgnoreCase(str))
		{
			c=input.charAt(i);
			break;
		}
	}
	
	System.out.println(c);
}
}
