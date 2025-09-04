import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ps1_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float[] scores=judgesScores(sc);
         System.out.println("Scores of 8 judges in panel" +scores);

        Analyse(scores);
    }
    public static float[] judgesScores(Scanner obj){
       float scores[]=new float[8];
        for(int i=0;i<8;i++){
            System.out.println("Enter the score of judge "+(i+1));
            scores[i]=obj.nextFloat();
        }
        return scores;
    }
    public static void Analyse(float[]scores){
        Arrays.sort(scores);
        System.out.println("Your lowest score is"+scores[0]);
        System.out.println("YOur highest score is"+scores[scores.length-1]);
        int total=0;
        for(int i=1;i<scores.length-2;i++){
          total+=scores[i];
        }
        System.out.println("Your Total Score is :"+total);
        System.out.println("Avg score is "+total/(scores.length-3));
    }
}
