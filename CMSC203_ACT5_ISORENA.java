import java.util.Scanner;
public class CMSC203_ACT5_ISORENA {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the first value  : ");
    double num1 = scan.nextDouble();

    System.out.print("Enter the second value : ");
    double num2 = scan.nextDouble();

    System.out.print("Select an operation : ");
    System.out.println(" +  -  *  / ");
    


    char operator;
    
    operator = scan.next().charAt(0);

    switch (operator) {

        case '+' : System.out.println("Answer = The sum is  " + (num1 + num2));
        break;

        case '-' : System.out.println("Answer = The difference is " + (num1 - num2));
        break;

        case '*' : System.out.println("Answer = The product is " + (num1 * num2));
        break;

        case '/' : System.out.println("Answer = The quotient is " + (num1 / num2));
        break;

        default:
        System.out.println("INVALID OPERATOR! ");
        break;

    }
  }
}






