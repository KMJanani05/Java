import java.io.*;
class Vowel
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a String");
String s=br.readLine();
int c=0;
for(char i:s.toLowerCase().toCharArray())
{
if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
c++;
}
System.out.println("Count of vowels"+c);
}
}
