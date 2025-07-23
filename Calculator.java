package mypackage;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  two number");
    
        int a=sc.nextInt();
        int b=sc.nextInt();
  
        System.out.println("Enter operation (+, -, *, /):");
        char op = sc.next().charAt(0); 

switch(op){

    case '+': 
           System.out.println(a + " + " + b + " = " + (a + b));

        break;

    case '*':
       
         System.out.println(a + " * " + b + " = " + (a * b));
        
        break;

     case '-':
        
          System.out.println(a + " - " + b + " = " + (a - b));
       
        break;

    case '/':    
        
         System.out.println(a + " / " + b + " = " + (a / b));
       
        break;
default:
        System.out.println("wrong operation");
}
       
    }
}
