import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scanner.nextInt();
        if(age<12){
            System.out.println("Total: $5");
        } else if(age<=17){
            System.out.println("Total: $8");
        } else {
            System.out.println("Total: $12");
        }

    }
}