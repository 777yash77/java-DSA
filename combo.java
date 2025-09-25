import java.util.*;

public class combo {
   public  static ArrayList<Integer>resoo=new ArrayList<>();
    public static void genCombo(int arr[][],int row,int col,int r,int[]res){
        if(r==row){
            int sum=0;
            for(int i=0;i<row;i++){
                System.out.print(res[i]+" ");
                sum+=res[i];
            }
            resoo.add(sum);
            System.out.println();
            return;
        }
        for(int j=0;j<col;j++){
            res[r]=arr[r][j];
            genCombo(arr,row,col,r+1,res);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the \"m\" and \"n\" value :");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("Enter "+(row*col)+" Elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
    }
    int resk[]=new int[100];
    int r=0;
    System.out.println("There are "+(power(col,row)+" Combinations and They are :"));
      genCombo(arr,row,col,r,resk); 
      Collections.sort(resoo);  
      System.out.println(resoo);
      int tar=sc.nextInt();
      System.out.println(resoo.get(tar-1));
}
    public static int power(int base,int limit){
        int res=1;
        for(int i=0;i<limit;i++){
          res=res*base;
        }
        return res;
    }
}


