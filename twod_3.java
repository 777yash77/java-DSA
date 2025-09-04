
import java.util.Arrays;
import java.util.Scanner;
public class twod_3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String one=sc.nextLine().toLowerCase().trim();
        System.out.println("Enter a String 2 :");
        String two=sc.nextLine().toLowerCase().trim();
  if(one.length()!=two.length()){
      System.out.println("Not Anagram");
  }
        char on[]=one.toCharArray();
        char tw[]=two.toCharArray();
      Arrays.sort(on);
      Arrays.sort(tw);
        int coun=0;

        for(int i=0;i<on.length;i++){
            if(on[i]==tw[i]){
                coun++;
            }else{
                System.out.println("Not Anagram");
                break;
            }
        }
      if(coun==on.length){
          System.out.println("Anagram");
      }
      sc.close();
       
    }
}
