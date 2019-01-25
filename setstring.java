import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
Set<String> ts=new TreeSet<String>();
int t=in.nextInt();
int i=0;
while(i<=t)
{
ts.add(in.nextLine());
i++;
}
System.out.println(ts);
}
}
