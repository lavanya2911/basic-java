import java.util.*;
import java.lang.*;
import java.io.*;
class Palin
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		char ch[]=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		int flag=0;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				flag=1;
				break;
			}
			i++;
			j--;

		}
		if(flag==1)	
			System.out.println("not palindrome");
		else
			System.out.println("palindrome");
		}
}


