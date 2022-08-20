package Arrays;

public class RepeatingEvenNumbers {

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {4, 3, 6, 3, 6, 8, 2, 5, 56, 3, 234, 7, 4};
        int[] dupList = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[j] % 2 == 0 && (!isFind(dupList, list[i]))) {
                        dupList[startIndex++] = list[j];
                    }
                    break;
                }
            }
        }

        for (int i: dupList){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}

