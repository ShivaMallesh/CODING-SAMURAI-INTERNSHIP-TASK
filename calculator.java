import java.util.*;

public class calculator {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the operator : ");
        System.out.printf("1 : Addition\n2 : Substraction\n3 : Multiplication\n4 : Division\n5 : exit\n");
        while(true)
        {
            System.out.print("Choose operator : ");
            int op=sc.nextInt();
            System.out.print("Enter the 1st Number : ");
            int n1=sc.nextInt();
            System.out.print("Enter the 2nd Number : ");
            int n2=sc.nextInt();
            System.out.println("");
            switch (op)
             {
                case 1:
                    System.out.println("Addition of two numbers is : "+(n1+n2));
                    break;
                case 2:
                  System.out.println("Substraction of the two numbers is : "+(n1-n2));
                       break;
                case 3:
                   System.out.println("Multiplication of two numbers is : "+(n1*n2));
                     break;
                case 4:
                 if(n2==0)
                 {
                    System.out.println("Enter valid number plz..");
                 }
                 System.out.println("Division of the two numbers is : "+(n1/n2));
                 break;
                default:
                System.out.println("Thank you : visit again");
                System.exit(0);
                    break;
            }
        }
        

    }
}
