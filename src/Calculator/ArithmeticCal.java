package Calculator;

import java.util.Scanner;

public class ArithmeticCal {

		public static void main(String[] args) {
			 char operator;
			    int num1, num2, result;

			    Scanner input = new Scanner(System.in);

			    System.out.println("Choose an operator: A, S, M, or D");
			    operator = input.next().charAt(0);

			    System.out.println("Enter first number");
			    num1 =input.nextInt();

			    System.out.println("Enter second number");
			    num2 =  input.nextInt();

			    switch (operator) {

			      case 'A':
			        result = num1 + num2;
			        System.out.println( "Add: " + result);
			        break;

			      case 'S':
			          result = num1 - num2;
			          System.out.println("Subtract: " + result);
			          break;

			        case 'M':
			          result = num1 * num2;
			          System.out.println("Multiplay: " + result);
			          break;

			        case 'D':
			          result = num1 / num2;
			          System.out.println("Divide: " + result);
			          break;

			        default:
			          System.out.println("Invalid operator!");
			          break;
			      }

			      input.close();
			    }
			  }
