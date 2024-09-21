import java.io.*;
class Array
{
int a[];
void input(int n)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
a=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the"+(i+1)+"Element:");
a[i]=Integer.valueOf(br.readLine());
}
}
void output()
{
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
}
class Nmain
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter n");
int n=Integer.valueOf(br.readLine());
Array a=new Array();
a.input(n);
a.output();
}
}

