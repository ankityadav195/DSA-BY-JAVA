package array;

public class Segregate0sadn1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,0,1,1,1,0,0};

        int number = 0;
        int number1 = arr.length - 1;

        while (number < number1) {
            if (arr[number] == 0) {
                number++;
            } 
            else if (arr[number1] == 1) {
                number1--;
            } 
            else {
                int temp = arr[number];
                arr[number] = arr[number1];
                arr[number1] = temp;

                number++;
                number1--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
