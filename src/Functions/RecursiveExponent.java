package Functions;

public class RecursiveExponent {

    public static int power(int baseNumber, int exponentNumber) {

        if (exponentNumber == 1) {
            return baseNumber;
        }
        return power(baseNumber,exponentNumber-1) * baseNumber;
    }

    public static void main(String[] args) {

        System.out.println(power(5, 3));
    }
}
