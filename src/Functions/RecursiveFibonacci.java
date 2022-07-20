package Functions;

public class RecursiveFibonacci {

    public static int recursiveFibonacci(int number) {
        if (number == 1 || number == 2){
            return 1;
        }
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(6));
    }
}
