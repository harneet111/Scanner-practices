import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your grade?");
        int mark = scanner.nextInt();
        if(mark>=80){
            System.out.println("Excellent");
        } else if(mark>=70){
            System.out.println("Good");
        } else if(mark>=60){
            System.out.println("Satisfactory");
        } else if(mark>=50){
            System.out.println("Pass");
        } else {
            System.out.println("Below passing");
        }
}
    }



