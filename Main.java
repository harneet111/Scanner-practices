import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner store= new Scanner(System.in);
        System.out.println("What is your mark?");
        int mark= store.nextInt();
        if(mark>=50){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}