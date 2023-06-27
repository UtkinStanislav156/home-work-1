// 2. Вывести все простые числа от 1 до 1000. 
// ==============================================


package Seminars.Seminar1;

public class hw1_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1001; i++) {
            
            boolean isPrime = true;  
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                
                if ((i % j) == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " "); 
            }
        }
    }
}