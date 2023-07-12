import java.util.Scanner;
class Student
{
String name;
int rollno,mark;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter name of student");
name=sc.next();
System.out.println("Enter the rollno");
rollno=sc.nextInt();
System.out.println("Enter the mark");
mark=sc.nextInt();
}
void display()
{
System.out.println("Name of student:"+name);
System.out.println("Rollno of student:"+rollno);
System.out.println("Mark of student:"+mark);
}
class Sports
{
String sports_name;
int activity_point;
Scanner sc=new Scanner(System.in);
void read2()
{
System.out.println("Enter the sports name:");
sports_name=sc.next();
System.out.println("Enter activity point");
activity_point=sc.nextInt();
}
void display2()
{
System.out.println("Sports name:"+sports_name);
System.out.println("Activity point:"+activity_point);
}}}
class Main
{
public static void main(String args[])
{
Student obj1=new Student();
Student.Sports obj2=obj1.new Sports();
obj1.read();
obj2.read2();
obj1.display();
obj2.display2();
}
}