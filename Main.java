import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner jennie = new Scanner(System.in);
        System.out.println("The light is on. (True/False)");
        boolean ans= jennie.nextBoolean();
        if(ans==true){
            System.out.println("The light is on.");
        } else {
            System.out.println("The light is off.");
        }
    }
}