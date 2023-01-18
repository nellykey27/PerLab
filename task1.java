import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        System.out.print("Введите длину массива: ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[res]);
            res = (res + m-1) % n;
        }
    }
}
