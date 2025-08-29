public class Loop{
    public static void main(String[] args){
        for(double i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 0; i <= 20; i++){
            System.out.println(i);
        }
        for(float i = 0; i < 100; i++){
            System.out.println(i);
        }

        int breakNumber = 30;
        int num = 0;
        while(true){
            double ranNum = (double) Math.random();
            System.out.println(ranNum);
            System.out.println(num);
            num++;
            if(breakNumber == num){
                System.out.println(num);
                break;
            }
        }
         do {
            System.out.println("This Line Already execute  ");
         }while(false);
        
    }
}