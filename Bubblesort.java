import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter n values into array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for( int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After performing bubble sort the elements of the array are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
output
Enter the no.of elements in array
5
Enter n values into array 
25 33 58 45 37
After performing bubble sort the elements of the array are:
25
33
37
45
58
