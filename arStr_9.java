import java.util.Scanner;

public class arStr_9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String line=sc.nextLine().trim();

        String arr[]=line.split("\\s+");

        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(arr[i]);
            }
             
        }

    }
}
