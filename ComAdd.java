import java.io.*;
class Complex
{
int ip,rp;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the ip,rp");
rp=Integer.valueOf(br.readLine());
i
p=Integer.valueOf(br.readLine());
}
void process(Complex a,Complex b)
{
rp=a.rp+b.rp;
ip=a.ip+b.ip;
}
void output()
{
if(ip>=0)
System.out.println(rp+"+"+ip+"i");
else
System.out.println(rp+" "+ip+"i");
}
}
class Cmain
{
public static void main(String arg[])throws IOException
{
Complex a=new Complex();
Complex b=new Complex();
Complex c=new Complex();
a.input();
b.input();
c.process(a,b);
c.output();
}
}