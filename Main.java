import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pick a number between 1-3 to get food choices.");
        int choice= scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Pizza, $6");
                break;
            case 2:
                System.out.println("Sandwich, $5");
                break;
            case 3:
                System.out.println("Pasta, $7");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}