class marks
{
public static void main(String a[])
{
int telugu,hindi,english;
float total,Average,highest;
System.out.println("Enter the three subjects marks:");
telugu=82;
hindi=95;
english=56;
total=telugu+hindi+english;
if(telugu>hindi&& telugu>english)
{
System.out.println("highest mark="+telugu);
}
else if(hindi>telugu&& hindi>english)
{
System.out.println("highest mark="+hindi);
}
else 
System.out.println("highest mark="+english);
Average=total/5;
System.out.println("Total marks="+total);
System.out.println("Average marks="+Average);
}
}
