
import java.util.Scanner;

public class Methods{
    public static void main(String[] args){
        System.out.println(additionNum(8,20));
        System.out.println(multipleNum(10,23));
        System.out.println(subNum(90,40));
        System.out.println(divideNum(800,220));
        int[] numbers = {2, 4, 50, 6, 80, 20};
        System.out.println(allNumAddition(numbers));
        System.out.println(temperature("F" , 98));
        System.out.println(dynamicTemperature());

        
    }

    public static int additionNum(int a,int b){
        return a + b;
    }
    
    public static int multipleNum(int a, int b){
        return a * b;
    }

    public static int subNum(int a, int b){
        return a - b;
    }
    
    public static int divideNum(int a,int b){
        return a / b;
    }

    public static int allNumAddition(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length -1; i++){
            sum += nums[i];
        }
        return sum;
    }


    public static String temperature(String typeOfTemperature, int value){
        String outputMessage = "Your temperature is ";

        if(typeOfTemperature.equals("C")){
            float result = value * 9/5 + 32;
            return outputMessage + "on Fahrenheit " + result;
        }if (typeOfTemperature.equals("F")) {
            float result = (value - 32) * (9/5);
            return outputMessage + "on  Celsius " + result;
        } else {
            System.out.println("Please provide type of temperature C or F");
            return "";
        }
    }



    public static String dynamicTemperature(){
        Scanner sc = new Scanner(System.in);
        String tempType;
        System.out.println("Please type C or F to convert your Temperature");
        tempType = sc.next();
        float tempVal;
        if(tempType.equals("C")){
            System.out.println("Please type your Celsius number to return Fahrenheit value");
            tempVal = sc.nextInt();
            return "Your Celsius value is: " + tempVal + " to convert Fahrenheit: " + ((tempVal * 9f / 5f) + 32);
        }if (tempType.equals("F")){
            System.out.println("Please type your Fahrenheit number to return Celsius value");
            tempVal = sc.nextInt();
            return "Your Fahrenheit value is: " + tempVal + " to convert Celsius: " + ((tempVal - 32) * (5f / 9f));
        }else{
            return "Something went wrong";
        }
        
    }

}