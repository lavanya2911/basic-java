import java.io.*;
import java.util.*;
import java.lang.*;
class setint
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
Set<Integer> ts=new TreeSet<Integer>();
int t=in.nextInt();
int i=0;
while(i<t)
{
ts.add(in.nextInt());
i++;
}
System.out.println(ts);
}
}
