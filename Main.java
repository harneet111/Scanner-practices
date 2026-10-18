import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("What colour is the traffic light? Answer in lowercase");
        String ans= scanner.nextLine();
        switch(ans){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("Go.");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}