
import java.util.HashMap;
import java.util.Scanner;
public class arStr_8 {
    public static void main(String[] args) {
        HashMap<Character,Character>toUpper=new HashMap<>();  
        Scanner sc=new Scanner(System.in);
        char temp='A';
        for(int i='a';i<='z';i++){
            toUpper.put((char)i,temp);
            temp++;
        }
        System.out.println("enter a String");
        String input=sc.nextLine();
        String res="";
        
        for(int i=0;i<input.length();i++){
            if(toUpper.containsKey(input.charAt(i))){
                res+=toUpper.get(input.charAt(i));
            }else{
                res+=input.charAt(i);
            }
        }
        System.out.println(res);
    }
}
