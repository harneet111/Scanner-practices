import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pick a number");
        int num1=scanner.nextInt();
        System.out.println("Pick another number");
        int num2=scanner.nextInt();
        System.out.println("Great. Now press 1 if you'd like to add your numbers together, press 2 if you'd like to subtract your first number from your second, press 3 if you'd like to subtract your second number from your first one, or press 4 if you'd like to multiply the numbers");
        int choice= scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println( "The sum is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("The difference is: " + (num1-num2));
                break;
            case 3:
                System.out.println("The difference is: " + (num2-num1));
                break;
            case 4:
                System.out.println("The product is: " + (num1 * num2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}