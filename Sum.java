import java.io.*;
class Sum
{
int a[],sum,n;
double avg;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter n:");
n=Integer.valueOf(br.readLine());
a=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the:"+(i+1)+"Elem:");
a[i]=Integer.valueOf(br.readLine());
}
}
void process()
{
sum=0;
for(int i=0;i<n;i++)
sum=sum+a[i];
avg=(double)sum/n;
}
void output()
{
System.out.println("Sum="+sum+"Avg="+avg);
}
}
class NSmain
{
public static void main(String arg[])throws IOException
{
Sum a=new Sum();
a.input();
a.process();
a.output();
}
}


