package Arrays;

public class MinMaxValue {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 12, 632, -2, 123, 4, 3, 1};
        int min = list[0];
        int max = list[0];

        for (int i : list) {

            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }
        System.out.println("Listenin en küçük değeri: " + min);
        System.out.println("Listenin en büyük değeri: " + max);

    }
}