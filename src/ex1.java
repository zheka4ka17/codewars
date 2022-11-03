import java.util.Scanner;

public class ex1 {
    /*Write a function that takes an array of numbers and returns the sum of the numbers.
    The numbers can be negative or non-integer.
     If the array does not contain any numbers then you should return 0.
     */
    public static void main(String[] args) {
        System.out.println("Введите длину массива size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double [] arr = new double[size];
        double sum=0.0;
        System.out.println("Введите size-чисел массива ");
        for (int i=0; i<size; i++){
            arr[i]=scanner.nextDouble();
        sum+=arr[i];}
        System.out.printf("Sum of the numbers : %f", sum);
        }

    }

