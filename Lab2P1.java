import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Lab2P1 {
    public static void main(String[] args) {
        int choice;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: /* add mulTest() call */
                    int result = 0;
                    count = 0;
                    for(int i =0; i<5; i++){
                        result = mulTest();
                        if (result == 1){
                            count = count + 1;
                        }
                    }
                    System.out.printf("%d out of 5 are correct\n\n", count);
                    break;
                case 2: /* add divide() call */
                    System.out.println("Pick 1st integer: ");
                    int a = sc.nextInt();
                    System.out.println("Pick 2nd integer: ");
                    int b = sc.nextInt();
                    result = divide(a, b);
                    System.out.printf("%d/%d = %d\n\n", a, b, result);
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Pick 1st integer: ");
                    a = sc.nextInt();
                    System.out.println("Pick 2nd integer: ");
                    b = sc.nextInt();
                    result = modulus(a, b);
                    System.out.println(a + " % " + b + " = " + result + "\n");
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Input number: ");
                    a = sc.nextInt();
                    if (a < 0 ){
                        System.out.println("n : " + a + " - Error Input!\n");
                        break;
                    }
                    else {
                        result = countDigits(a);
                        System.out.println("n : " + a + " - count = " + result + "\n");
                    }
                    break;
                case 5: /* add position() call */
                    System.out.println("Pick Number: ");
                    a = sc.nextInt();
                    System.out.println("Pick Digit: ");
                    b = sc.nextInt();
                    result = position(a, b);
                    if(result == 0){
                        System.out.println("position = -1\n");
                    }
                    else {
                        System.out.printf("position = %d\n\n", result);
                    }
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("Pick Number : ");
                    a = sc.nextInt();
                    if (a < 0) {
                        System.out.println("oddDigits = Error input!!\n");
                    }
                    else {
                        System.out.println("oddDigits = " + extractOddDigits(a) + "\n");
                    }
                    break;
                case 7: System.out.println("Program terminating ....");
            }
        } while (choice < 7);
    }

    public static int mulTest() {
        Scanner sc1 = new Scanner(System.in);
        Random rand = new Random();
        int answer = 0;
        int user_in = 0;
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        answer = a * b;
        System.out.printf("How much is %d times %d ", a ,b);
        user_in = sc1.nextInt();
        if (answer == user_in) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int divide(int m, int n){
        int result = m;
        int answer = 0;
        do{
            result = result - n;
            if (result > 0){
                answer = answer + 1;
            }
            else if (result == 0){
                answer = answer + 1;
                break;
            }
        } while (result > 0);
        return answer;
    }
    
    public static int modulus(int m, int n){
        int result = m;
        int answer = 0;
        do{
            result = result - n;
            if (result > 0){
                continue;
            }
            else if (result == 0){
                answer = 0;
                break;
            }
            else {
                result = result + n;
                answer = result; 
                break;
            }
        } while (result > 0);
        return answer;
    }

    public static int countDigits(int n){
        int result = 0;
        do{
            n = n/10;
            if (n == 0){
                result = result + 1;
                break;
            }

            else if (n < 0){ 
                result = result + 1;
                break;
            }

            else if (n > 0){
                result = result + 1;
                continue;
            }
    
        } while (n > 0);
        return result;
    }

    public static int position(int n, int digit){
        int result = 0;
        int holder = 0;
        do{
            holder = n%10; 
            n = n/10;
            result = result + 1;
            if(holder == digit){
                break;
            }
            else if(n <= 0) {
                result = 0;
                break;
            }
    
        } while (holder != digit);
        return result;
    }

    public static long extractOddDigits(long n){
        long odd = 0;
        long currentNum = 0;
        long count = 0;
        while (n > 0) {
            currentNum = n % 10;
            n = n / 10;
            if (currentNum % 2 != 0) {
                odd += currentNum * (Math.pow(10, count));
                count++;
            }
        }

        if (odd == 0) {
            return -1;
        }

        return odd;
    }
}
