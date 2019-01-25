import java.io.*;
import java.util.*;
import java.lang.*;
class Hashmap
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
HashMap<String,Integer> hm=new HashMap<String,Integer>();
hm.put("lavanya",291198);
hm.put("ramya",291198);
hm.put("anitha",240597);
System.out.println(hm);
if(hm.containsKey("lavanya"))
{
Integer l=hm.get("lavanya");
System.out.println(l);
}
}
}
