public class Array{
    public static void main(String[] args) {

        int[] number ={12,33,1,3,4,5,2};
        for(int i = 0; i< number.length - 1; i++){
            System.out.println(number[i]);
        }

        int[][] roll_register = {{1,2233},{2,2234},{3,2235},{4,2234},{5,2236}};
        String[] student_names = {"Sohan", "Roni", "Riyad","Rayhan","Rina"};
        
        for(int i = 0; i < roll_register.length -1; i++){
            
                System.out.println("Your name is: "+student_names[i] + ", roll: " +roll_register[i][0]+ " and registration number is: " +roll_register[i][1]);

        }

        int numbers[] = {2,3,1,4,6,2,6,0,9,8,1,2,3};
        int[] ordNumbers = new int[numbers.length];
        int[] evenNumbers = new int[numbers.length];
        int ordIdx = 0;
        int evenIdx = 0;

        // pushing the base on requirement
        for(int i = 0; i < numbers.length -1;i++){
            if(numbers[i] % 2 == 0){
                ordNumbers[ordIdx] = numbers[i];
                ordIdx++;
            }else{
                evenNumbers[evenIdx] = numbers[i];
                evenIdx++;
            }
        }

        // see the value of ord numbers 
        
        for(int i = 0; i< ordNumbers.length -1; i++){
            if(ordNumbers[i] != 0){
                System.out.println("Ord: " + ordNumbers[i]);
            }
        }
        
        // see the value of ord even numbers
        for(int i = 0; i< evenNumbers.length -1; i++){
            if(ordNumbers[i] != 0){
                System.out.println("Even: " + evenNumbers[i]);
            }
        }
        

    }
}