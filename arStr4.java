import java.util.Scanner; 
public class arStr4 
{ 
    public static void main(String[] args) {
        
        int[]arr={12,23,12,65,34,87,348};
         int result=findKsmallest(arr,3);
          System.out.println(result);
 }
public static int findKsmallest(int arr[],int k){
int temp=Integer.MAX_VALUE;
int index=-1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]<temp){
            temp=arr[i];
            index=i;
        }
    }
    arr[index]=Integer.MAX_VALUE;

    if(k==1){
        return temp;
    }else{
        return findKsmallest(arr,k-1);
    }
 }
}                                                                                                                                                                  