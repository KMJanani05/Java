import java.io.*;
import java.util.*;
class Sort
{
int a[],n;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the n");
n=Integer.valueOf(br.readLine());
a=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the"+(i+1)+"Element");
a[i]=Integer.valueOf(br.readLine());
}
}
void process()
{
for(int i=0;i<n-1;i++)
for(int j=i+1;j<n;j++)
if(a[i]>a[j])
{
int c=a[i];
a[i]=a[j];
a[j]=c;
}
}
void output()
{
Arrays.sort(a);
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
class NSMain
{
public static void main(String arg[])throws IOException
{
Sort x=new Sort();
x.input();
//x.process();
x.output();
}
}
