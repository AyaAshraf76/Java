import java.util.Scanner;

class Number {
    private int value; 

    // Method to set the number
    public void setValue(int value) {
        this.value = value;
    }

    // Method to get the number
    public int getValue() {
        return value;
    }
}

class PrimeChecker extends Number {

    public boolean isPrime() {
        int num = getValue(); 
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= num / 2; i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}


public class PrimeNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        PrimeChecker primeChecker = new PrimeChecker(); 

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 

        primeChecker.setValue(number); 


        if (primeChecker.isPrime()) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close(); 
    }
}
