import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner data= new Scanner(System.in);
        System.out.println("What is the game score?");
        int ans= data.nextInt();
        if(ans > 100){
            System.out.println("New score!");
        }
        }
    }

