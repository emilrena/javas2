import java.util.Scanner;
class ComplexNum
{
int real,img;
ComplexNum(int real, int img)
{
this.real=real;
this.img=img;
}
ComplexNum addComp(ComplexNum firstNum,ComplexNum secondNum)
{
ComplexNum temp=new ComplexNum(0,0);
temp.real=firstNum.real+secondNum.real;
temp.img=firstNum.img+secondNum.img;
return temp;
}}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of first complex number:");
int real1=sc.nextInt();
System.out.println("Enter the imaginary part of first complex number:");
int img1=sc.nextInt();
System.out.println("Enter the real part of second complex number:");
int real2=sc.nextInt();
System.out.println("Enter the imaginary part of second complex number:");
int img2=sc.nextInt();
ComplexNum firstNum=new ComplexNum(real1,img1);
ComplexNum secondNum=new ComplexNum(real2,img2);
ComplexNum sum=new ComplexNum(0,0);
sum=sum.addComp(firstNum,secondNum);
System.out.println("The complex number after addition:"+sum.real+"+"+sum.img+"i");
}
}