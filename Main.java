import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose a number.");
        int num1= scanner.nextInt();
        System.out.println("Choose another one.");
        int num2= scanner.nextInt();
        if(num1 > num2){
            System.out.println(num1 + ">" + num2);
        } else if(num1==num2){
            System.out.println(num1 + "=" + num2);
        } else {
            System.out.println(num2 + ">" + num1);
        }
    }
}