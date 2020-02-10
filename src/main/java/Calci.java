import java.util.Scanner;
import java.io.*;
public class Calci {
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st operand\n");
		int a;
		a=sc.nextInt();
		System.out.println("Enter 2nd operand\n");
		int b;
		b=sc.nextInt();
		System.out.print("Enter an operator (+, -, *, /): ");
		int q;
		 char z = sc.next().charAt(0);
		switch(z)
        {
            case '+':
                q =  a +b ;
                break;
            case '-':
            	 q =  a-b ;
                break;
            case '*':
            	 q =  a*b ;
                break;
            case '/':
                q=a/b;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
		 System.out.printf("%d %c %d = %d", a, z, b, q);
	}
}