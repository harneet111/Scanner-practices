import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner scanner= new Scanner(System.in);
         System.out.println("What is the temperature?");
         int choice= scanner.nextInt();
         if(choice<0){
             System.out.println("Freezing temperature");
         }
         }
     }
