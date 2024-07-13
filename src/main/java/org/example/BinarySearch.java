package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 8, 4, 6, 9, 0, 2, 7};
        Arrays.sort(arr);
        int arrLength = arr.length;
        Scanner scanNum = new Scanner(System.in);
        System.out.println("عدد خود را وارد کنید : ");
        String num1 = scanNum.nextLine();
        int searchNum = Integer.parseInt(num1);

        int result = BinarySearch(arr, searchNum);
        if (result == -1) {
            System.out.println("عدد وارد شده در آرایه موجود نیست");
        } else {
            System.out.println("در خانه " + result + " آرایه مقدار " + searchNum + " قرار دارد");
        }
    }

    public static int BinarySearch(int arr[], int number) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}