import java.util.*;

public class arStr6{
public static void main(String[]args){
   List<Integer>Pos=new ArrayList<>();
   List<Integer>Neg=new ArrayList<>();
int[]arr={12,-34,23,87,-6,1,16,-8};
   for(int i:arr){
      if(i>=0){
         Pos.add(i);
      }else{
         Neg.add(i);
      }
   }
   for(int i=0;i<Pos.size();i++){
      arr[i]=Pos.get(i);
   }
   int idx=0;
   for(int i=Pos.size();i<arr.length;i++){
      arr[i]=Neg.get(idx);
      idx++;
   }
   for(int i:arr){
      System.out.print(i+" ");
   }
}
}