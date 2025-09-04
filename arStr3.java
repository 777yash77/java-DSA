

public class arStr3 {
     public static void main(String[] args) {   
        int[]arr={9,11,53,67,23,89};
        
        System.out.println(finAdjacent(arr));
        }
        public static int finAdjacent(int[]arr){
            for(int i=0;i<arr.length;i++){
                if(i==0){
                    if(arr[i]>arr[i+1]){
                        return arr[i];
                    }
                }
                else if(i==arr.length-1){
                    if(arr[i]>arr[i-1]){
                        return arr[i];
                    }
                }else{
                    if(arr[i]>arr[i+1]||arr[i]>arr[i-1]){
                        return arr[i];
                    }
                }
               
            }
            return -1;
        }
    }

