import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class PureCharInput{
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        char[] chars=new char[1000];
        int n=0;
        int ch;
        int vowels=0;;
        try{

        
        while((ch=br.read())!='\n'&&ch!=-1){
            char temp=(char)ch;
            chars[n++]=temp;
           
            if("AEIOUaeiou".indexOf(temp)!=-1){
                vowels++;
            }
        }
    }catch(IOException f){
        f.printStackTrace();
    }
        System.out.println(vowels);
        System.out.println("length: "+n);
      
        for(int i=n-1;i>=0;i--){
          System.out.print(chars[i]);
        }
        System.out.println();
        String res="";
        for(int i=0;i<n;i++){
             res+=chars[i];
        }
        System.out.println(res);
    }

}
