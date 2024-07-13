package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryRecursive {
    public static void main(String[] args) {
        int arr[] = {5, 8, 4, 6, 9, 0, 2, 7};
        Arrays.sort(arr);
        Scanner scanNum = new Scanner(System.in);
        System.out.println("عدد خود را وارد کنید : ");
        String num1 = scanNum.nextLine();
        int number = Integer.parseInt(num1);

        int result = binarySearch(arr, 0, arr.length -1, number);
        if (result == -1) {
            System.out.println("عدد وارد شده در آرایه موجود نیست");
        } else {
            System.out.println("در خانه " + result + " آرایه مقدار " + number + " قرار دارد");
        }
    }

    public static int binarySearch(int arr[], int left, int right, int number) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                return binarySearch(arr, left, mid - 1, number);
            } else {
                return binarySearch(arr, mid + 1, right, number);
            }
        }
        return -1;
    }
}

