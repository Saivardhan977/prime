public class Main{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int number = 1; number <= 100; number++) {
            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++; 
                }
            }
            if (count == 2) {
                System.out.print(number + " ");
            }
        }
    }
}
