import java.util.ArrayList;

public class arStr {
    public static void main(String[]args){
        int[]arr={100,200,13,31,97,10,20,11};
       ArrayList<Integer>res=removePrime(arr);
        for(int i:res){
            System.out.println(i);
        }

    }
    public static ArrayList<Integer> removePrime(int[]arr){
         ArrayList<Integer>res=new ArrayList<>();
           for(int i=0;i<arr.length;i++){
            Boolean resk=false;
              for(int j=2;j<=arr[i]/2;j++){
                if(arr[i]%j==0){
                    res.add(arr[i]);
                    i++;
                }
              }
           }
           return res;
    }
}
