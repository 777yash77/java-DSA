import java.util.Scanner;

public class arStr_10 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine().trim().replace(" ","");
        int partition=sc.nextInt();

        patternPrint(line,partition);
    }
    public static void patternPrint(String line,int partition){
       int len=line.length();
       int start=0;
       int dog=partition;
       while(start<line.length()){
        for(int i=start;i<dog;i++){
            if(i<line.length()){
                System.out.print(line.charAt(i));
            }     
        }
        System.out.println();
        start=dog;
        dog+=partition;

       }
    }
}
