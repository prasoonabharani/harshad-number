import java.io.*;
import java.util.*;
public class Harshadnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int n=num,sum=0,r;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
} 
if(num%sum==0)
{ 
System.out.println("Harshad number");}
else
{System.out.println("not harshad number");}
}}