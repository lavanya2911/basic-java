import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
int n=in.nextInt();
for(int i=0;i<n;i++)
{
a.add(in.nextInt());
}
System.out.println(a);
}
}

