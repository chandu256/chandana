class fruits
{
public void display()
{
System.out.println("fruit is very sweet");
}
}
class mango extends fruits
{
public void display()
{
System.out.println("mango is very sweetfruit");
}
}
class fruitsmain
{
public static void main(String a[])
{
fruits f1=new mango();
f1.display();
}
}