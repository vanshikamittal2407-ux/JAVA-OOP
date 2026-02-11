import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element: ");
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);
    }
}

