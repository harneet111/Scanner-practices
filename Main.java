import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the price?");
        double ans= scanner.nextDouble();
        if(ans>=100){
            ans= ans *0.90;
            System.out.println("10% discount applied, new total: " + ans);
        } else {
            System.out.println("No discount, total: " + ans);
    }
    }
}