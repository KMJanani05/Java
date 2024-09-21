import java.io.*;
class Div
{
float a,b,c;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the a,b");
a=Float.valueOf(br.readLine());
b=Float.valueOf(br.readLine());
}
void process()
{
c=a/b;
}
void output()
{
System.out.println(c);
}
}
class Dmain
{
public static void main(String arg[])throws IOException
{
Div x=new Div();
x.input();
x.process();
x.output();
}
}
