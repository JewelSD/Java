import java.util.*;
public class array
{
Scanner read=new Scanner(System.in);
int l=read.nextInt();
int a[]=new int[l];
public static void main(String[]args)
{
array obj=new array();
obj.readar();
obj.display();
}

void readar()
{
System.out.println("Enter the array limit:");

for(int i=0;i<l;i++)
{
a[i]=read.nextInt();
}
}

void display()
{
System.out.println("Your Matrix is");
for(int i=0;i<l;i++)
{
System.out.println(a[i]);
}
}
}



