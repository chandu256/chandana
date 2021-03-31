class sum
{
public static void main(String a[])
{
int n=Integer.parseInt(a[0]);
int sum=0;
for(int i=1;i<n;i++)
{
if(n%3==0)
{
sum=sum+i;
}
}
System.out.println("sum of all numbers divisible by 3 is:"+sum);
}
}
