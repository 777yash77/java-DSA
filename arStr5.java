
public class arStr5 {
    public static void main(String[] args) {
        
        int arr[]={0,2,1,1,2,1,0,0,2,1};
      
        int arr1[]=new int[2+1];
        arr1[0]=0;
        arr1[1]=0;
        arr1[2]=0;
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<arr1.length;i++){
            while(arr1[i]>0){
                arr[index]=i;
                arr1[i]--;
                index++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
