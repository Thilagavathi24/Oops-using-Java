import java.io.*;
import java.util.*;
class Anogram
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
int count=0;


if (a.length()!=b.length())
{
System.out.println("not Anogram");
}
else 
{
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)!=b.charAt(i))
{
count++;
}
}
System.out.println(count);
}
}
}