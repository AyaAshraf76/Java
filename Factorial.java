import java.util.Scanner;

class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public long calculate() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        Factorial factorial = new Factorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial.calculate());
        
        scanner.close();
    }
}
