import java.util.Arrays;
import java.util.Scanner;

public class ps1_6 {
    public static void main(String []args){
     int[]arr={1,2,3,4,5,6};
     Scanner sc =new Scanner(System.in);
     int key=sc.nextInt();
     int[]newArr=cycle(arr,key);
     System.out.println(Arrays.toString(newArr));
    }
    public static int[] cycle(int[]arr,int key){
        for(int i=0;i<key;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length;j++){
                if(j!=arr.length-1){
                    arr[j]=arr[j+1];
                }else{
                    arr[j]=temp;
                }
               
            }
        }
        return arr;
    }
}
