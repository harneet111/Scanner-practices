import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner delivery= new Scanner(System.in);
        System.out.println("What is the order total?");
        double total= delivery.nextDouble();
        if(total>=50){
            System.out.println("You qualify for free delivery");
            }
    }
}