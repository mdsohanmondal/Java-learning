
import java.util.Scanner;


public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;

        age = sc.nextInt();
        if(age >= 18){
            System.out.println("Accepted");
            System.out.println("Welcome to my java program");
        }else{
            System.out.println("Not allowed");
            System.out.println("User will be age 18+ or 18");
        }        
    }
}