import java.util.Scanner;

public class twoD_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the matrix format (ex:3x3) :");
        String size=sc.nextLine().replaceAll("x","");
        int n=Integer.parseInt(size.charAt(0)+"");
        int m=Integer.parseInt(size.charAt(size.length()-1)+"");
      int totalzeros=0;
       int[][]arr=new int[n][m];
       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the character");
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                      totalzeros+=1;
                }
            }
       }
       if(totalzeros>(n*m)/2){
           System.out.println("It is a sparse matrix");
       }else{
           System.out.println("Its not a Sparse Matrix");
       }

       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
       }
       sc.close();
   
    }
}
