
import java.util.Scanner;
public class twod_4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
          String res="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='b'){
                res+="";
                continue;
            }
            if(i!=word.length()-1&&word.substring(i,i+2).equals("ac")){
                res+="";
                i++;
                continue;
            }
            res+=word.charAt(i);
        }
        System.out.println(res);
    }
}
