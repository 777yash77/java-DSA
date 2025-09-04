public class ps1_3{
    public static void main(String[]args){
        int[]example={12,11,45,22,56};
        searchFor(example,56);
    }
    public static void searchFor(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+" found in "+(i+1));
                return;
            }
        }
        System.out.println("Target not found:");
    }
}

