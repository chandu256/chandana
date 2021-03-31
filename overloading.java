class overloadingAdd
{
void sum(int a,int b)
{
System.out.println("sum of two integers:"+(a+b));
}
void sum(double a,double b)
{
System.out.println("sum of two double:"+(a+b));
}
class overloadingdemo
{
public static void main(String a[])
{
Add A=new Add();
A.sum(2,3);
A.sum(3.7,5.2);
}
}
}