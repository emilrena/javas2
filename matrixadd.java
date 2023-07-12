import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
System.out.println("Enter the number of rows:");
int row=input.nextInt();
System.out.println("Enter the number of columns:");
int col=input.nextInt();
int x[][]=new int[row][col];
int y[][]=new int[row][col];
System.out.println("Enter first matrix:");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
x[m][n]=input.nextInt();
}
}
System.out.println("Enter second matrix:");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
y[m][n]=input.nextInt();
}
}
int z[][]=new int[row][col];
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
z[m][n]= x[m][n] + y[m][n];
}
}
System.out.println("Matrix after addition");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
System.out.println(z[m][n]+" ");
}
System.out.println(" ");
}
}
}