import java.util.Scanner;

class Reverse
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    swap(arr,n);
    sc.close();
    }
    public static void swap(int[]arr,int n){
    int temp,p,q;
    
    for(p=0;p<n/2;p++){
        temp = arr[p];
        arr[p] = arr[n-p-1];
        arr[n-p-1] = temp;
        }
        
    System.out.print("The reversed array is: ");
    for(q=0;q<n;q++){
        System.out.print(arr[q]+" ");
    }
    
    }
}
/*
 */
