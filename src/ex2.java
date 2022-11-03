import java.util.Arrays;

public class ex2 {
    /*In this Kata, you will be given an array of unique elements,
     and your task is to rearrange the values so that the first max value is followed by the first minimum,
      followed by second max value then second min value, etc.
     */
     static int [] arr = {5,7,10,6,0,8,11,25,16};
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int index=0;
        int index1=1;
        for(int i=0; i< arr.length; i++) {
            max = arr[i];
            min = arr[i];

            for (int j = i+1; j < arr.length; j++){
                if ( arr[j] > max){
                    max = arr[j];
                    index=j;}
                if (arr[j]<min){
                    min=arr[j];
                      index1=j;}}
            if (i%2==0){
                System.out.println(max);
                swap(i,index);
           }
            else if(i%2==1){
                System.out.println(min);
                swap(i,index1);
            }

            System.out.println(Arrays.toString(arr));
        }

    }
    static void swap(int i , int j){
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }

}
