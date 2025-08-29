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
        
        String password = "sohan1234";
        String logPass;
        logPass = sc.next();
        if(logPass.equals(password)){
            System.out.println("Login Success");
        }else{
            System.out.println("your password was incorrect");
        }
    }
}