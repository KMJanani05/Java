import java.io.*;
class Big
{
int a[],n,big; 
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the n");
n=Integer.valueOf(br.readLine());
a=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the"+(i+1)+"Element:");
a[i]=Integer.valueOf(br.readLine());
}
}
void process()
{
big=a[0];
for(int i=0;i<n;i++)
if(a[i]>big)
big=a[i];
}
void output()
{
System.out.println("Biggest Value in the Array is:"+big);
}
}
class NSmain
{
public static void main(String arg[])throws IOException
{
Big x=new Big();
x.input();
x.process();
x.output();
}
}


